## 🔢 Input
["apple", "banana", "apple", "orange", "banana", "apple"]

## ▶️ Execution

Start with empty map {}

Step 1: apple → {apple=1}
Step 2: banana → {apple=1, banana=1}
Step 3: apple → {apple=2, banana=1}
Step 4: orange → {apple=2, banana=1, orange=1}
Step 5: banana → {apple=2, banana=2, orange=1}
Step 6: apple → {apple=3, banana=2, orange=1}

## ✅ Output
{apple=3, banana=2, orange=1}

## 🧠 Observation
HashMap allows quick updates using getOrDefault.