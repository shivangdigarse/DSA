package dynamicPgm;

import java.util.Arrays;
import java.util.List;

public class LL120 {
    public int pathTotal(List<List<Integer>> triangle, int a, int b, int[][] dp){
        int m = triangle.size();
        if (a == m - 1) return triangle.get(a).get(b);
        if(dp[a][b] != Integer.MAX_VALUE) return dp[a][b];
        dp[a][b] = triangle.get(a).get(b) + Math.min(pathTotal(triangle,a+1,b,dp),pathTotal(triangle,a+1,b+1,dp));
        return dp[a][b];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        if(m == 0) return 0;
        int[][] dp = new int[m][m];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        return pathTotal(triangle,0,0,dp);
    }
}
