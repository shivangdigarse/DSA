package dynamicPgm;

import java.util.Arrays;

public class LL62 {
    public int totalPath(int m, int n,int[][] dp, int a, int b){
        if(a == m-1 && b == n-1) return 1;
        if(a == m || b == n) return 0;
        if(dp[a][b] != -1) return dp[a][b];
        dp[a][b] = totalPath(m ,n, dp, a, b+1) + totalPath(m ,n, dp, a+1, b);
        return dp[a][b];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return totalPath(m, n, dp, 0, 0);
    }
}
