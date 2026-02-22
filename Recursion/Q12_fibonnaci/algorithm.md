## 🧠 Problem
Find the nth Fibonacci number using recursion.

## 🎯 Goal
Return the value of Fibonacci at position n.

## 🪜 Algorithm
1. If n ≤ 1 → return n (base cases).
2. Otherwise → return fibonacci(n-1) + fibonacci(n-2).
3. Recursion continues until base cases reached.

## 🧮 Time Complexity
O(2^n)

## 💾 Space Complexity
O(n) (recursion stack)

## 🧩 Edge Cases
- n = 0
- n = 1
- Large n (slow due to repeated calculations)