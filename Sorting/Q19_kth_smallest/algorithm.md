## 🧠 Problem
Find the kth smallest element in an array without fully sorting it.

## 🎯 Goal
Return the element that would appear at position k in sorted order.

## 🪜 Algorithm (QuickSelect)
1. Choose a pivot element.
2. Partition array so smaller elements are on left.
3. If pivot index = k-1 → return pivot.
4. If pivot index > k-1 → search left subarray.
5. Otherwise → search right subarray.

## 🧮 Time Complexity
Average: O(n)  
Worst: O(n²)

## 💾 Space Complexity
O(1)

## 🧩 Edge Cases
- k = 1 (smallest element)
- k = n (largest element)
- Duplicate values