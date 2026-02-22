## 🧠 Problem
Solve the Tower of Hanoi problem using recursion.

## 🎯 Goal
Move all disks from source rod to destination rod following rules:
- Only one disk moved at a time
- Larger disk cannot be placed on smaller disk

## 🪜 Algorithm
1. If n = 1:
   - Move disk from source to destination.
2. Otherwise:
   - Move n-1 disks from source to auxiliary.
   - Move nth disk from source to destination.
   - Move n-1 disks from auxiliary to destination.

## 🧮 Time Complexity
O(2^n)

## 💾 Space Complexity
O(n) (recursion stack)

## 🧩 Edge Cases
- n = 1
- Large n (many recursive calls)