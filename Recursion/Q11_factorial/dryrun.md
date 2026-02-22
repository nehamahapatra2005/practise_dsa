## 🔢 Input
n = 5

## ▶️ Execution

factorial(5)
= 5 × factorial(4)

factorial(4)
= 4 × factorial(3)

factorial(3)
= 3 × factorial(2)

factorial(2)
= 2 × factorial(1)

factorial(1)
= 1 (base case)

Backtracking:
= 2 × 1 = 2  
= 3 × 2 = 6  
= 4 × 6 = 24  
= 5 × 24 = 120  

## ✅ Output
120

## 🧠 Observation
Recursion builds stack until base case, then multiplies while returning.