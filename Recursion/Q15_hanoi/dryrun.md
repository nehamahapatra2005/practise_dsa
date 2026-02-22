## 🔢 Input
n = 3
Source = A, Destination = C, Auxiliary = B

## ▶️ Execution

Move disk 1 from A → C  
Move disk 2 from A → B  
Move disk 1 from C → B  
Move disk 3 from A → C  
Move disk 1 from B → A  
Move disk 2 from B → C  
Move disk 1 from A → C  

## ✅ Output
Sequence of moves to solve puzzle

## 🧠 Observation
Problem breaks into smaller subproblems until n = 1.