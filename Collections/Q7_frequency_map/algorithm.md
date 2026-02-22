## 🧠 Problem
Count the frequency of each element in an array.

## 🎯 Goal
Return a map where key = element and value = count.

## 🪜 Algorithm
1. Create an empty HashMap.
2. Traverse each element:
   - If element exists → increment count.
   - Otherwise → add element with count = 1.
3. Return the map.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(n)

## 🧩 Edge Cases
- Empty array
- All elements same
- All elements unique