## 🧠 Problem
Reverse an array without using extra space.

## 🎯 Goal
Return the array in reversed order by modifying it in-place.

## 🪜 Algorithm
1. Initialize two pointers:
   - left = 0
   - right = n - 1
2. While left < right:
   - Swap arr[left] and arr[right]
   - Increment left
   - Decrement right
3. Stop when pointers meet.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(1) (in-place)

## 🧩 Edge Cases
- Empty array
- Single element array