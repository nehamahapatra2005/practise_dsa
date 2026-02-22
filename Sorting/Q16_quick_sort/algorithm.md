## 🧠 Problem
Sort an array using Quick Sort.

## 🎯 Goal
Arrange elements in ascending order using divide and conquer.

## 🪜 Algorithm
1. Choose a pivot element (last element).
2. Partition array so:
   - elements smaller than pivot on left
   - larger elements on right
3. Recursively apply QuickSort on left and right subarrays.
4. Continue until subarray size is 1.

## 🧮 Time Complexity
Best/Average: O(n log n)  
Worst: O(n²)

## 💾 Space Complexity
O(log n) recursion stack

## 🧩 Edge Cases
- Already sorted array
- Single element
- Duplicate elements