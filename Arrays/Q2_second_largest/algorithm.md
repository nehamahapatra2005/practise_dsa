## 🧠 Problem
Find the second largest element in an array.

## 🎯 Goal
Return the second highest number without sorting.

## 🪜 Algorithm
1. Initialize two variables:
   - first = smallest possible value
   - second = smallest possible value
2. Traverse array:
   - If current element > first:
     - second = first
     - first = element
   - Else if element > second and element ≠ first:
     - second = element
3. Return second.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(1)

## 🧩 Edge Cases
- Array with duplicates
- Array with negative numbers
- Array with fewer than 2 elements