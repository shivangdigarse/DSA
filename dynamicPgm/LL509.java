package dynamicPgm;

public class LL509 {
//    static int[] dp;
//
//    // MEMOIZATION (Top-Down) - Recursive with caching
//    public int fibo(int n){
//        // BASE CASES: F(0)=0, F(1)=1
//        if(n <= 1) return n;
//
//        // CACHE HIT: Return stored result if already computed
//        if(dp[n] != 0) return dp[n];
//
//        // RECURSIVE CASE: F(n) = F(n-1) + F(n-2), store result
//        return dp[n] = fibo(n-1) + fibo(n-2);
//    }
//
//    public int fib(int n) {
//        // Initialize DP array of size n+1 with zeros (-1 could also work for unvisited)
//        dp = new int[n+1];
//        return fibo(n);
//    }
//
//    // TABULATION (Bottom-Up) - Iterative space optimized O(1)
//    public int fib(int n){
//        // BASE CASES
//        if(n <= 1) return n;
//
//        // Initialize with F(0)=0, F(1)=1
//        int prev = 1;      // F(1)
//        int prev2 = 0;     // F(0)
//        int current = 0;
//
//        // Fill from 2 to n iteratively
//        for(int i = 2; i <= n; i++){
//            // F(i) = F(i-1) + F(i-2)
//            current = prev + prev2;
//            // Slide window: prev2 <- prev <- current
//            prev2 = prev;
//            prev = current;
//        }
//        return current;    // F(n)
//    }
}

/*
COMPLETE EXPLANATION OF ALL 3 FIBONACCI IMPLEMENTATIONS:

1. MEMOIZATION (Top-Down DP):
   ╔══════════════════════════════════════════════╗
   ║ Time: O(n) │ Space: O(n) + O(n) recursion    ║
   ║ - Recursive tree with caching                ║
   ║ - Only computes each fib(n) once             ║
   ║ - Natural recursive structure                ║
   ║ - Higher constant factor due to recursion    ║
   ╚══════════════════════════════════════════════╝

2. TABULATION with DP Array (Bottom-Up, commented out):
   ╔══════════════════════════════════════════════╗
   ║ Time: O(n) │ Space: O(n)                     ║
   ║ - Iterative filling from base cases          ║
   ║ - dp[i] = dp[i-1] + dp[i-2]                 ║
   ║ - No recursion overhead                      ║
   ╚══════════════════════════════════════════════╝

3. SPACE OPTIMIZED TABULATION (O(1) space):
   ╔══════════════════════════════════════════════╗
   ║ Time: O(n) │ Space: O(1)                     ║
   ║ - Only track prev2, prev (sliding window)    ║
   ║ - No array needed, just 3 variables          ║
   ║ - Most efficient implementation              ║
   ╚══════════════════════════════════════════════╝

COMPLEXITY COMPARISON:
┌─────────────────┬────────┬────────┐
│ Implementation  │ Time   │ Space  │
├─────────────────┼────────┼────────┤
│ Pure Recursion  │ O(2^n) │ O(n)   │
│ Memoization     │ O(n)   │ O(n)   │
│ Tabulation      │ O(n)   │ O(n)   │
│ Space Optimized │ O(n)   │ O(1)   │
└─────────────────┴────────┴────────┘

TRACE EXECUTION (n=5):
F(5): prev2=0(0), prev=1(1), current=1(2)
F(5): prev2=1(1), prev=1(2), current=2(3)
F(5): prev2=1(2), prev=2(3), current=3(5) ← Return 3 ✅

PERFECT PROGRESSION: Recursion → Memo → Tabulation → O(1) Space
*/
