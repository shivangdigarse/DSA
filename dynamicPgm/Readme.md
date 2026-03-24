# Dynamic Programming

Dynamic Programming (DP) solves optimization problems by breaking them into overlapping subproblems and optimal substructure, storing intermediate results to avoid redundant computation.

## Prerequisites
DP requires two properties:
- **Optimal Substructure**: Optimal solution to problem can be constructed from optimal solutions of subproblems.
- **Overlapping Subproblems**: Recursive solution recomputes same subproblems multiple times.

## Core Approaches

### Tabulation (Bottom-up)
Iterative approach starting from base cases, building solution using a DP table.

**Process:**
1. Create DP array/table with base cases initialized
2. Fill table iteratively using recurrence relation
3. Return final state

**Example: Fibonacci**
```python
def fib(n):
    if n <= 1: return n
    dp = [0] * (n+1)
    dp[1] = 1
    for i in range(2, n+1):
        dp[i] = dp[i-1] + dp[i-2]
    return dp[n]
```

### Memoization (Top-down)
Recursive approach with caching of computed results.

**Process:**
1. Recursive function with memo dictionary/array
2. Check if result exists in memo → return it
3. Otherwise compute, store, return

**Example: Fibonacci**
```python
def fib(n, memo={}):
    if n <= 1: return n
    if n in memo: return memo[n]
    memo[n] = fib(n-1, memo) + fib(n-2, memo)
    return memo[n]
```

## Key Differences

| Aspect | Tabulation | Memoization |
|--------|------------|-------------|
| Direction | Base → Target | Target → Base |
| Control Flow | Iterative | Recursive |
| Space | Predictable | Stack risk |
| Subproblems | All computed | Only needed |
| Implementation | Easier loops | Cleaner recursion |

## Classical Problems & Patterns

### 1D DP
- **Fibonacci**: `dp[i] = dp[i-1] + dp[i-2]`
- **Climbing Stairs**: Ways to reach top
- **House Robber**: Max money without adjacent

### 2D DP
| Problem | State | Transition |
|---------|-------|------------|
| **0/1 Knapsack** | `dp[i][w]` | `dp[i-1][w]` vs `dp[i-1][w-weight[i]] + value[i]` |
| **LCS** | `dp[i][j]` | Match → `dp[i-1][j-1]+1`, else max neighbors |
| **Edit Distance** | `dp[i][j]` | Min of insert/delete/replace + neighbors |

### Common Patterns
```
1. Count ways: dp[i] += dp[prev_states]
2. Max/Min: dp[i] = max/min(dp[prev_states])
3. Subset sum: dp[sum] = True if achievable
4. Palindrome: dp[i][j] = s[i]==s[j] + dp[i+1][j-1]
```

## Step-by-Step Problem Solving

```
1. Identify if DP applicable (overlapping + optimal substructure)
2. Define state: dp[i][j] = "meaning for substring/prefix i,j"
3. Write recurrence: dp[i] = f(dp[i-1], dp[i-2]...)
4. Get base cases: dp[0], dp[1], empty states
5. Decide: Tabulation vs Memoization
6. Code + Test edge cases
7. Optimize space if possible
8. Trace path if need actual solution
```

## Space Optimization Techniques

```
1. Two variables: dp[i] = dp[i-1] + dp[i-2] → prev, curr
2. One variable: Modify in-place for some problems
3. Rolling array: Keep only last 2 rows for 2D → O(min(m,n))
```

**Example: Fibonacci Space Optimized**
```python
def fib(n):
    if n <= 1: return n
    prev, curr = 0, 1
    for _ in range(2, n+1):
        prev, curr = curr, prev + curr
    return curr
```

## Complexity Analysis

| Problem Type | Time | Space |
|--------------|------|-------|
| 1D (Fib-like) | O(n) | O(1) optimized |
| 2D (LCS/Knapsack) | O(nm) | O(min(n,m)) optimized |
| 3D States | O(nml) | Varies |

## Practice Roadmap

**Beginner (1D)**
- Fibonacci, Climbing Stairs
- Min Cost Climbing Stairs
- House Robber series

**Intermediate (2D)**
- 0/1 Knapsack
- Longest Common Subsequence
- Edit Distance

**Advanced**
- Palindromic Substrings
- Burst Balloons
- Regular Expression Matching

## Debugging Checklist
```
❌ Infinite recursion? → Base cases wrong
❌ Wrong answer? → Recurrence or indices off
❌ TLE? → Exponential without memo
❌ MLE? → Table too big, optimize space
❌ IndexError? → Array bounds check
```

## Quick Reference Formulas

```
Fibonacci: dp[i] = dp[i-1] + dp[i-2]
Knapsack: dp[i][w] = max(dp[i-1][w], dp[i-1][w-wt]+val)
LCS: if s1[i]==s2[j]: dp[i-1][j-1]+1 else max(dp[i-1][j], dp[i][j-1])
Subset Sum: dp[sum] |= dp[sum - nums[i]]
```

No, the README doesn't cover everything needed to **reliably identify** DP problems during interviews.

## DP Problem Identification Checklist ✅

```
🔍 QUICK 30-SECOND TEST - Ask these 3 questions:

1. OVERLAPPING SUBPROBLEMS?
   "Does the same subproblem get solved multiple times?"
   ❌ Tree traversal (each node visited once) → NO
   ✅ Fibonacci (F(3) called many times) → YES

2. OPTIMAL SUBSTRUCTURE? 
   "Can I build optimal solution from optimal sub-solutions?"
   ❌ Sorting (order matters globally) → MAYBE
   ✅ Knapsack (best items → best total) → YES

3. KEYWORD PATTERNS?
   "Does problem ask for MAX/MIN/COUNT ways?"
```

## 🚩 **RED FLAGS = DP PROBLEM (90% accuracy)**

```
PROBLEM ASKS FOR:
• "Maximum/Minimum [profit/time/cost]"
• "Number of ways to [reach/arrange/form]"
• "Longest/Shortest [sequence/path/substring]"
• "Can [sum/target] be achieved?"
• Words: "optimal", "minimum cost", "maximum profit"

INSTANT DP: "Max profit with at most K transactions"
```

## **PROBLEM PATTERNS BY STATE DIMENSIONS**

```
1D STATE: dp[i] = "answer up to index i"
├── Fibonacci: dp[i] = dp[i-1] + dp[i-2]
├── Climbing Stairs: dp[i] = dp[i-1] + dp[i-2]
├── House Robber: dp[i] = max(dp[i-1], dp[i-2]+nums[i])
└── Unbounded Knapsack

2D STATE: dp[i][j] = "answer for i vs j"
├── 0/1 Knapsack: dp[i][w] = max(dp[i-1][w], dp[i-1][w-wt]+val)
├── LCS: dp[i][j] = match ? dp[i-1][j-1]+1 : max(dp[i-1][j], dp[i][j-1])
├── Edit Distance, Palindrome Partitioning

3D STATE: dp[i][j][k] (rare in interviews)
└── Burst Balloons, Dice Combinations
```

## **IDENTIFICATION FLOWCHART**

```
Problem Statement
      ↓
"MAX/MIN/COUNT?" ─── YES ──> DP CANDIDATE
      ↓ NO
"Multiple choices with constraints?" ─── YES ──> DP
      ↓ NO
"Greedy/Cache works?" ────→ Try alternatives
```

## **5-SECOND MENTAL CHECKLIST**

```
1. Sequence/Array prefix? → 1D dp[i]
2. Two sequences? → 2D dp[i][j]  
3. Items + capacity? → dp[i][w] Knapsack
4. "Optimal path"? → dp[i][j] Grid/Graph
5. Recursive choices? → Memoization
```

## **INSTANT RECOGNITION EXAMPLES**

```
DP IMMEDIATELY: "Max coins without adjacent houses"
DP AFTER THINKING: "Min cost to paint houses [R,G,B]"
NOT DP: "Rotate matrix 90°", "Valid parentheses"
```
