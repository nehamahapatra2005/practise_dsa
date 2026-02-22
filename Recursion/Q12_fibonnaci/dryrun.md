## 🔢 Input
n = 5

## ▶️ Execution

fibonacci(5)
= fibonacci(4) + fibonacci(3)

fibonacci(4)
= fibonacci(3) + fibonacci(2)

fibonacci(3)
= fibonacci(2) + fibonacci(1)

fibonacci(2)
= fibonacci(1) + fibonacci(0)

Base cases:
fibonacci(1) = 1  
fibonacci(0) = 0  

Backtracking:
fibonacci(2) = 1  
fibonacci(3) = 2  
fibonacci(4) = 3  
fibonacci(5) = 5  

## ✅ Output
5

## 🧠 Observation
Each call splits into two calls, causing exponential growth.