## 🧠 Problem
Sort an array containing only 0s, 1s, and 2s.

## 🎯 Goal
Sort the array without using built-in sorting.

## 🪜 Algorithm (Dutch National Flag)
1. Initialize three pointers:
   - low = 0
   - mid = 0
   - high = n - 1
2. While mid ≤ high:
   - If arr[mid] == 0 → swap low and mid, increment both.
   - If arr[mid] == 1 → increment mid.
   - If arr[mid] == 2 → swap mid and high, decrement high.
3. Continue until mid > high.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(1)

## 🧩 Edge Cases
- All elements same
- Single element array