# A Lightweight Deep-CNN-Based Mobile Application in the Screening of Acute Lymphoblastic Leukemia


- **Abstract:**

ALL is a highly prevalent cancer, and its definitive diagnosis demands invasive and costly diagnostic tests with side effects for patients. Access to definitive diagnostic equipment for ALL is limited in many geographical areas. Peripheral blood smear (PBS) examination has always been a major ALL screening and diagnosis technique. Still, the examination of PBS samples by laboratory personnel and hematologists is riddled with disadvantages. Meanwhile, artificial intelligence (AI) techniques can achieve remarkable results in PBS image analysis. The present study aimed to design and implement a well-tuning model based on deep convolutional neural networks (CNNs) to detect ALL cases from hematogones and then determine the ALL subtype. A mobile application was also designed for screening ALL from non-ALL cases. In the modeling stage, after color thresholding-based segmentation in the color LAB space, applying the K-means clustering algorithm, and adding a mask to the clustered images, a segmented image free from unnecessary clinical components was generated. Subsequently, by comparing the efficiency of three notable architectures of Lightweight CNN (EfficientNetB0, MobileNetV2, and NASNet Mobile), the most efficient model was selected, and the proposed model was accordingly configured and tuned. The proposed model achieved an accuracy of 100%. Finally, a mobile application was designed based on this state-of-the-art model. In the real laboratory setting, the mobile application based on the proposed model classified ALL cases from other classes and achieved a sensitivity and specificity of 100% as a robust screening tool. The application that relies on preprocessing and deep learning (DL) algorithms can be used as a powerful screening tool by hematologists and clinical specialists to ignore or minimize unnecessary bone marrow biopsy cases and decrease the ALL diagnosis time. 

- **Proposed framework:**

![11](https://user-images.githubusercontent.com/92205834/160405051-b0159653-bc81-4775-9ff9-642d68986f8b.png)

- **Splitting data:**

![image](https://user-images.githubusercontent.com/92205834/160360088-21689fc7-0092-47c0-8828-f4940517c9a0.png)

- **Segmentation stages:**

![image](https://user-images.githubusercontent.com/92205834/160360181-881888b8-34a5-4fd4-b3e9-cebaa05bd58e.png)
a) RGB color space, b) LAB color space, c) K-Means Clustering d) Binary Thresholding, e) Cleaning methods and mask generation, f) Mask application on the RGB original image. 

- **Results of detection Model:**

![image](https://user-images.githubusercontent.com/92205834/160360330-581c268b-dd5d-458a-9722-e5e9557119fa.png)
![image](https://user-images.githubusercontent.com/92205834/160360345-7132cdcb-3754-4f0d-ac3c-665815f17131.png)
![image](https://user-images.githubusercontent.com/92205834/160360362-45b4d4ac-1f2a-4e94-a8e7-fea75c3d531d.png)

- **Mobile Application Based on Proposed model in Detection and Diagnosis ALL:**

![image](https://user-images.githubusercontent.com/92205834/160360502-9dd72bcf-30f1-489a-a67b-29a1fdd05fa1.png)


- **Datasets:**
ALL Dataset is available at: ----Soon.

- **Citation:**

You may also access the paper: ----Soon.
```
Mustafa Ghaderzadeha, Mohammad Amir Eshraghi, ... .
```

