## 🔢 Input
[1, 2, 3]

## ▶️ Execution

printArray(arr, 0)
→ print 1  
→ call printArray(arr,1)

printArray(arr,1)
→ print 2  
→ call printArray(arr,2)

printArray(arr,2)
→ print 3  
→ call printArray(arr,3)

printArray(arr,3)
index == length → stop

## ✅ Output
1 2 3

## 🧠 Observation
Function keeps calling itself with next index.