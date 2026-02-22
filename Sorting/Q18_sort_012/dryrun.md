## 🔢 Input
[2, 0, 2, 1, 1, 0]

## ▶️ Execution

low=0 mid=0 high=5

Step1: arr[mid]=2 → swap with high  
[0, 0, 2, 1, 1, 2] high=4

Step2: arr[mid]=0 → swap with low  
[0, 0, 2, 1, 1, 2] low=1 mid=1

Step3: arr[mid]=0 → swap with low  
[0, 0, 2, 1, 1, 2] low=2 mid=2

Step4: arr[mid]=2 → swap with high  
[0, 0, 1, 1, 2, 2] high=3

Continue until mid>high

## ✅ Output
[0, 0, 1, 1, 2, 2]

## 🧠 Observation
Three pointers divide array into three regions.