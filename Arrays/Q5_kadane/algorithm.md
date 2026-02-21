## 🧠 Problem
Find the contiguous subarray with the maximum sum.

## 🎯 Goal
Return the largest possible sum of any subarray.

## 🪜 Algorithm (Kadane’s Algorithm)
1. Initialize:
   - current = first element
   - max = first element
2. Traverse the array from second element:
   - current = max(element, current + element)
   - max = max(max, current)
3. Return max.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(1)

## 🧩 Edge Cases
- All negative numbers
- Single element array
- Large input