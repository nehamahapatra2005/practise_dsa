## 🧠 Problem
Check if a string is palindrome using recursion.

## 🎯 Goal
Return true if string reads same forward and backward.

## 🪜 Algorithm
1. If string length ≤ 1 → return true (base case).
2. Compare first and last characters:
   - If not equal → return false.
3. Call recursion on substring excluding first and last characters.
4. Continue until base case reached.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(n) (recursion stack)

## 🧩 Edge Cases
- Empty string
- Single character
- Case sensitivity