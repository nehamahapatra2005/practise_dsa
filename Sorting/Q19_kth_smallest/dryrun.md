## 🔢 Input
[7, 10, 4, 3, 20, 15], k = 3

## ▶️ Execution

Pivot = 15  
Partition → [7,10,4,3,15,20]  
Pivot index = 4  

k-1 = 2 → search left subarray  

Next pivot = 3  
Partition → [3,4,7,10]  
Pivot index = 0  

Search right  

Eventually pivot index = 2 → element = 7

## ✅ Output
3rd smallest = 7

## 🧠 Observation
QuickSelect narrows search instead of sorting entire array.