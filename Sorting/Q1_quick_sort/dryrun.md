## 🔢 Input
[8, 4, 7, 3, 9, 2]

## ▶️ Execution

Pivot = 2

Partition:
[2, 4, 7, 3, 9, 8]

Now pivot index = 0

Sort right subarray:
[4, 7, 3, 9, 8]

Next pivot = 8

Partition:
[4, 7, 3, 8, 9]

Continue recursively until sorted.

## ✅ Output
[2, 3, 4, 7, 8, 9]

## 🧠 Observation
Array gets divided around pivot each step.