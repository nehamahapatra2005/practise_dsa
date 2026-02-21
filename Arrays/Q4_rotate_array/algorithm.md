## 🧠 Problem
Rotate an array to the right by k positions.

## 🎯 Goal
Shift elements so that last k elements move to the front.

## 🪜 Algorithm (Reversal Method)
1. Compute k = k % n.
2. Reverse the entire array.
3. Reverse first k elements.
4. Reverse remaining n-k elements.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(1)

## 🧩 Edge Cases
- k > n
- k = 0
- Single element array