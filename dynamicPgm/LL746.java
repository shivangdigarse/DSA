package dynamicPgm;

class LL746 {
    // MEMOIZATION VERSION (Top-Down) - Commented out
    // public int minCost(int[] cost, int idx, int[] dp){
    //     // BASE CASES: Can only reach step 0 or 1 directly
    //     if(idx == 0 || idx == 1) return cost[idx];
    //
    //     // CACHE HIT: Return stored minimum cost if computed
    //     if(dp[idx] != -1) return dp[idx];
    //
    //     // RECURSIVE CHOICE: Pay cost[i] + min(from step i-1, from step i-2)
    //     return dp[idx] = cost[idx] + Math.min(
    //         minCost(cost, idx-1, dp),  // 1 step jump
    //         minCost(cost, idx-2, dp)  // 2 step jump
    //     );
    // }

    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     int[] dp = new int[n];
    //     Arrays.fill(dp, -1);
    //
    //     // Answer is min cost to reach LAST step from either n-1 or n-2
    //     return Math.min(
    //         minCost(cost, n-1, dp),  // Reach via step n-1
    //         minCost(cost, n-2, dp)   // Reach via step n-2
    //     );
    // }

    // SPACE OPTIMIZED TABULATION (Bottom-Up O(1) space) - ACTIVE VERSION
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        // Initialize base cases
        int prev = cost[0];   // minCost[0] = cost[0] (must pay to step on 0)
        int prev2 = cost[1];  // minCost[1] = cost[1] (must pay to step on 1)

        // Fill DP iteratively from step 2 to n-1
        for (int i = 2; i < n; i++) {
            // KEY INSIGHT: minCost[i] = cost[i] + min(minCost[i-1], minCost[i-2])
            // You MUST pay cost[i] when you step on i
            // You can arrive from either i-1 (1 step) OR i-2 (2 steps)
            int current = cost[i] + Math.min(prev, prev2);

            // Slide window: prev2 <- prev <- current
            prev = prev2;
            prev2 = current;
        }

        // Answer: Cheapest way to reach either final step (n-1 or n-2)
        // Since from either you can jump to "top" without additional cost
        return Math.min(prev, prev2);
    }
}

/*
COMPLETE EXPLANATION - MIN COST CLIMBING STAIRS

PROBLEM:
- Array cost[i] = cost to STEP ON stair i
- Can take 1 OR 2 steps at a time
- Find MIN total cost to reach TOP
- KEY: You can start from step 0 OR 1 (no cost to start)

DP STATE: dp[i] = MIN cost to reach step i

TRANSITION: dp[i] = cost[i] + min(dp[i-1], dp[i-2])
- MUST pay cost[i] when stepping on i
- Can arrive from i-1 (1 step jump) OR i-2 (2 step jump)

BASE CASES:
dp[0] = cost[0]  // Must pay to step on 0
dp[1] = cost[1]  // Must pay to step on 1

EXECUTION TRACE: cost = [10,15,20]
i=0: prev=10,  prev2=15
i=2: current=20 + min(10,15) = 25
     prev=15,   prev2=25
RETURN: min(15,25) = 15 ✅

3 IMPLEMENTATIONS COMPARED:
┌──────────────────┬────────┬────────┐
│ Method           │ Time   │ Space  │
├──────────────────┼────────┼────────┤
│ Memoization      │ O(n)   │ O(n)   │
│ Tabulation Array │ O(n)   │ O(n)   │
│ Space Optimized  │ O(n)   │ O(1)   │ ← BEST
└──────────────────┴────────┴────────┘

WHY RETURN min(prev, prev2)?
- After loop: prev=dp[n-2], prev2=dp[n-1]
- Can jump to top from either final step
- Take whichever is cheaper

PERFECT PROGRESSION:
Recursion → Memoization → Tabulation → O(1) Space Optimized ✅
*/
