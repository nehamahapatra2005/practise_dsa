## 🧠 Problem
Check if an array contains duplicate elements.

## 🎯 Goal
Return true if any value appears more than once.

## 🪜 Algorithm
1. Create an empty HashSet.
2. Traverse each element of the array:
   - Try to insert element into the set.
   - If insertion fails → duplicate exists → return true.
3. If loop finishes → return false.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(n)

## 🧩 Edge Cases
- Empty array
- All elements unique
- All elements same