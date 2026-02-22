## 🧠 Problem
Merge two sorted arrays without using extra space.

## 🎯 Goal
Combine both arrays so they remain sorted.

## 🪜 Algorithm
1. Start from end of arr1 and start of arr2.
2. Compare elements:
   - If arr1[i] > arr2[j] → swap.
3. Move pointers inward.
4. After swapping, sort both arrays.
5. Result: elements distributed in sorted order.

## 🧮 Time Complexity
O((n + m) log(n + m))

## 💾 Space Complexity
O(1)

## 🧩 Edge Cases
- One array empty
- All elements of arr1 smaller
- All elements of arr2 smaller