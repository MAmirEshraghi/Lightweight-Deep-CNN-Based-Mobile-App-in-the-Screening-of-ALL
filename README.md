
# Overall Overview:

![LDA_OV](https://github.com/MAmirEshraghi/Leukemia_Diagnosis_Application/assets/92205834/1794a148-2b24-4f6e-b2e0-e746683b68ed)

# R&D Process:
![LDA](https://github.com/MAmirEshraghi/Leukemia_Diagnosis_Application/assets/92205834/9dd8d252-704e-4a70-ad48-bf8e70c98a09)


# Abstract
Background:
B-cell acute lymphoblastic leukemia (B-ALL) is one of the most widespread cancers, and its definitive diagnosis demands invasive and costly diagnostic tests with side effects for patients. Access to definitive diagnostic equipment for B-ALL is limited in many geographical areas. Blood microscopic examination has always been a major B-ALL screening and diagnosis technique. Still, the examination of blood microscopically by laboratory personnel and hematologists is riddled with disadvantages. Meanwhile, AI techniques can achieve remarkable results in blood microscopy image analysis. The present study aimed to design and implement a well-tuned based on deep CNN to detect B-ALL cases from hematogones and then determine the B-ALL subtype.

Methods:
Based on the well-designed and tuned model, a mobile application was also designed for screening B-ALL from non-B-ALL cases. In the modeling stage, a unique segmentation technique was used for color thresholding in the color LAB space. By applying the K-means clustering algorithm, and adding a mask to the clustered images, a segmented image was obtained to eliminate unnecessary components. After comparing the efficiency of three notable architectures of lightweight CNN (EfficientNetB0, MobileNetV2, and NASNet Mobile), the most efficient model was selected, and the proposed model was accordingly configured and tuned.

Results:
The proposed model achieved an accuracy of 100%. Finally, a mobile application was designed based on this state-of-the-art model. In the real laboratory setting, the mobile application based on the proposed model classified B-ALL cases from other classes and achieved a sensitivity and specificity of 100% as a robust screening tool.

Conclusions:
The application that relies on preprocessing and DL algorithms can be used as a powerful screening tool by hematologists and clinical specialists to ignore or minimize unnecessary bone marrow biopsy cases and decrease the B-ALL diagnosis time.



- **Proposed framework:**
![14](https://user-images.githubusercontent.com/92205834/160648346-cd4f23ff-513c-4b2d-b070-17affd5ea8ca.png)



- dataset samples:

![2Untitlsed](https://github.com/MAmirEshraghi/Lightweight-Deep-CNN-Based-Mobile-App-in-the-Screening-of-ALL/assets/92205834/7a98cd2c-0648-40ec-a92a-c84c1bbb95a2)

![L35](https://github.com/user-attachments/assets/2b5b0bef-de46-40cb-bf4a-716252cff1ab)
![L36](https://github.com/user-attachments/assets/ea832d21-dcaa-4d73-9fc7-8c2fafff7466)


- **Segmentation stages:**
a) RGB color space, b) LAB color space, c) K-Means Clustering d) Binary Thresholding, e) Cleaning methods and mask generation, f) Mask application on the RGB original image. 

- **Performance of selected network in a unique situation:**

![image](https://user-images.githubusercontent.com/92205834/160406634-c83943a3-250a-4402-bd27-b51e8b90b18e.png)

- **Results of detection Model (MobileNetV3):**

![image](https://user-images.githubusercontent.com/92205834/160360330-581c268b-dd5d-458a-9722-e5e9557119fa.png)
![image](https://user-images.githubusercontent.com/92205834/160360345-7132cdcb-3754-4f0d-ac3c-665815f17131.png)
![image](https://user-images.githubusercontent.com/92205834/160360362-45b4d4ac-1f2a-4e94-a8e7-fea75c3d531d.png)

- **Mobile Application Based on Proposed Model in Detection and Diagnosis ALL:**

![image](https://user-images.githubusercontent.com/92205834/160360502-9dd72bcf-30f1-489a-a67b-29a1fdd05fa1.png)


# How to Work:

- First, Capturing a certain sample using the smartphone's camera from the microscope eyepiece: 
- Second, edit the taken sample using the provided options to adjust the part that is suspected of having leukemia cancer cells.

![Rec00421-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/99153e6e-644a-4cd9-afbe-3809d1caa04a)


- **Datasets:**

ALL Dataset is available at: https://www.kaggle.com/datasets/mohammadamireshraghi/blood-cell-cancer-all-4class.

- **Citation:**
If you use this dataset or code in your research, please credit the authors.

Azamossadat Hosseini, Mohammad Amir (Robin) Eshraghi, Tania Taami, Hamidreza Sadeghsalehi, Zahra Hoseinzadeh, Mustafa Ghaderzadeh, Mohammad Rafiee, A mobile application based on efficient lightweight CNN model for classification of B-ALL cancer from non-cancerous cells: A design and implementation study, Informatics in Medicine Unlocked, Volume 39, 2023, 101244, ISSN 2352-9148,

You may also access the paper: https://doi.org/10.1016/j.imu.2023.101244
```
Mustafa Ghaderzadeh, Mohammad Amir Eshraghi, Azamossadat Hossein, Mohammad Rafiee, Mohammad Hossein Mohammadid 
```
