package dynamicPgm;

import java.util.Arrays;

public class Gfg01KnapsackProblem {
    public static int[][] dp;
    public int maxi(int W, int val[], int wt[],int n){
        if(n == 0 || W == 0){
            return 0;
        }
        if(dp[n][W] != -1) return dp[n][W];
        if(wt[n-1] <= W){
            int take = val[n-1] + maxi(W-wt[n-1],val,wt,n-1);
            int skip = maxi(W,val,wt,n-1);
            dp[n][W] = Math.max(take,skip);
        }
        else{
            dp[n][W] = maxi(W,val,wt,n-1);
        }
        return dp[n][W];
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        dp = new int[n+1][W+1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return maxi(W,val,wt,n);
    }
}
