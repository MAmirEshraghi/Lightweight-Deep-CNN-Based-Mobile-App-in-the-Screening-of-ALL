package com.example.alldetection

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.alldetection.R
import com.example.alldetection.ml.Model4MobileNetV2
import org.tensorflow.lite.DataType
import org.tensorflow.lite.Interpreter
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.nio.ByteBuffer
import java.nio.ByteOrder


class MainActivity : AppCompatActivity() {

    lateinit var bitmap: Bitmap
    lateinit var imgview:ImageView
    lateinit var byteBuffer:ByteBuffer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgview = findViewById(R.id.imageView)

        val fileName = "labels.txt"
        val inputString = application.assets.open(fileName).bufferedReader().use{ it.readText()}
        var townList = inputString.split("\n")


        var tv:TextView = findViewById(R.id.textView2)

        var select: Button = findViewById(R.id.button)
        select.setOnClickListener(View.OnClickListener {

            var intent:Intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"

            startActivityForResult(intent,100)

        })

        var predict:Button = findViewById(R.id.button2)
        predict.setOnClickListener(View.OnClickListener {


            val model = Model4MobileNetV2.newInstance(this)

            val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.FLOAT32)

            byteBuffer = convertBitmapToByteBuffer(bitmap)

            inputFeature0.loadBuffer(byteBuffer) //(byteBuffer)

            // Runs model inference and gets result.
            val outputs = model.process(inputFeature0)
            val outputFeature0 = outputs.outputFeature0AsTensorBuffer

            var max = getMax(outputFeature0.floatArray)

            //var out1 =  (outputFeature0.floatArray[0].toString())

            tv.setText(
                "1. " + townList[0] + ": " +  String.format("%.2f",(outputFeature0.floatArray[0])) +"\n"+
                        "2. " + townList[1] + "    : " +  String.format("%.2f",(outputFeature0.floatArray[1])) +"\n"+
                        "3. " + townList[2] + "    : " +  String.format("%.2f",(outputFeature0.floatArray[2])) +"\n"+
                        "4. " + townList[3] + "   : " +  String.format("%.2f",(outputFeature0.floatArray[3])) +"\n"+
                        "\n" + "Prediction: " + townList[max]
            )
            // Releases model resources if no longer used.
            model.close()
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        imgview.setImageURI(data?.data)

        var uri: Uri?= data?.data
        bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)

        bitmap = Bitmap.createScaledBitmap(bitmap,224,224,true)

    }

    private val MAX_RESULTS = 3
    private val BATCH_SIZE = 1
    private val PIXEL_SIZE = 3
    private val THRESHOLD = 0.1f

    private val IMAGE_MEAN = 128
    private val IMAGE_STD = 128.0f
    //private val interpreter: Interpreter? = null
    private val inputSize = 224
    //private val labelList: List<String>? = null

    fun convertBitmapToByteBuffer(bitmap: Bitmap): ByteBuffer {

        val byteBuffer =
            ByteBuffer.allocateDirect(4 * BATCH_SIZE * inputSize * inputSize * PIXEL_SIZE)
        byteBuffer.order(ByteOrder.nativeOrder())
        val intValues = IntArray(inputSize * inputSize)
        bitmap.getPixels(intValues, 0, bitmap.width, 0, 0, bitmap.width, bitmap.height)
        var pixel = 0
        for (i in 0 until inputSize) {
            for (j in 0 until inputSize) {
                val `val` = intValues[pixel++]
                byteBuffer.putFloat(((`val` shr 16 and 0xFF) - IMAGE_MEAN) / IMAGE_STD)
                byteBuffer.putFloat(((`val` shr 8 and 0xFF) - IMAGE_MEAN) / IMAGE_STD)
                byteBuffer.putFloat(((`val` and 0xFF) - IMAGE_MEAN) / IMAGE_STD)
            }
        }
        return byteBuffer
    }

    fun getMax (arr:FloatArray) : Int{
        var ind = 0
        var min =0.0f

        for(i in 0..3)
        {
            if(arr[i] > min)
            {
                ind = i
                min = arr[i]
            }

        }
        return ind

    }
}