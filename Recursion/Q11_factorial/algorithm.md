## 🧠 Problem
Calculate factorial of a number using recursion.

## 🎯 Goal
Return n! (n factorial).

## 🪜 Algorithm
1. If n ≤ 1 → return 1 (base case).
2. Otherwise → return n × factorial(n - 1).
3. Recursion continues until base case reached.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(n) (recursion stack)

## 🧩 Edge Cases
- n = 0
- n = 1
- Large n (stack overflow)