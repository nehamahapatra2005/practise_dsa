## 🧠 Problem
Remove duplicate elements from a list while maintaining original order.

## 🎯 Goal
Return a list containing only unique elements in same order.

## 🪜 Algorithm
1. Create a LinkedHashSet from the list.
   - This removes duplicates automatically.
   - Maintains insertion order.
2. Convert the set back to an ArrayList.
3. Return the list.

## 🧮 Time Complexity
O(n)

## 💾 Space Complexity
O(n)

## 🧩 Edge Cases
- Empty list
- All elements unique
- All elements duplicate