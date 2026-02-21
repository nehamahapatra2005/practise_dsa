## 🔢 Input
[-2, 1, -3, 4, -1, 2, 1, -5, 4]

## ▶️ Execution

Start:
current = -2, max = -2

Step 1: num = 1  
current = max(1, -2+1= -1) = 1  
max = 1  

Step 2: num = -3  
current = max(-3, 1-3= -2) = -2  
max = 1  

Step 3: num = 4  
current = 4  
max = 4  

Step 4: num = -1  
current = 3  
max = 4  

Step 5: num = 2  
current = 5  
max = 5  

Step 6: num = 1  
current = 6  
max = 6  

Step 7: num = -5  
current = 1  
max = 6  

Step 8: num = 4  
current = 5  
max = 6  

## ✅ Output
Maximum sum = 6

## 🧠 Observation
Negative sums are discarded; we restart from next element.