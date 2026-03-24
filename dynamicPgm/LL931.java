package dynamicPgm;

import java.util.Arrays;

public class LL931 {
    public int minPath(int [][] matrix, int m, int n, int a, int b, int[][] dp){
        if(a < 0 || a >= m || b >= n || b<0) return Integer.MAX_VALUE;
        if(a == m-1) return matrix[a][b];
        if(dp[a][b] != Integer.MAX_VALUE) return dp[a][b];
        int left = minPath(matrix,m,n,a+1,b-1,dp);
        int below = minPath(matrix,m,n,a+1,b,dp);
        int right = minPath(matrix,m,n,a+1,b+1,dp);
        dp[a][b] = matrix[a][b] + Math.min(left,Math.min(below,right));
        return dp[a][b];
    }
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m == 0 || n == 0) return 0;
        int[][] dp = new int[m][n];
        for(int[] row: dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = minPath(matrix,m,n,0,i,dp);
        }
        int min = Integer.MAX_VALUE;
        for(int ele:arr){
            if(min>ele) min = ele;
        }
        return min;
    }
}
