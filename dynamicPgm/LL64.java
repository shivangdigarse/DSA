package dynamicPgm;

import java.util.Arrays;

public class LL64 {
    public int minPathCost(int[][] grid, int m, int n, int a, int b, int[][] dp){
        if(a == m || b == n) return Integer.MAX_VALUE;
        if(a == m-1 && b == n-1) return grid[a][b];
        if(dp[a][b] != -1) return dp[a][b];
        dp[a][b] = grid[a][b] + Math.min(minPathCost(grid,m,n,a+1,b,dp),minPathCost(grid,m,n,a,b+1,dp));
        return dp[a][b];
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        if(m == 0) return 0;
        int n = grid[0].length;
        if(n == 0) return 0;
        int[][] dp = new int[m+1][n+1];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return minPathCost(grid,m,n,0,0,dp);

    }
}
