package dynamicPgm;

import java.util.Arrays;

public class TufNinjaTraining {
    public int maxPoints(int day, int lastTask, int[][] matrix, int[][] dp){
        if(day == 0){
            int maxi = 0;
            for(int task = 0; task < 3; task++){
                if(task != lastTask){
                    maxi = Math.max(maxi, matrix[0][task]);
                }
            }
            return dp[day][lastTask] = maxi;
        }
        if(dp[day][lastTask] != -1){
            return dp[day][lastTask];
        }
        int maxi = 0;

        for(int task = 0; task < 3; task++){

            if(task != lastTask){

                int points = matrix[day][task] +
                        maxPoints(day-1, task, matrix, dp);

                maxi = Math.max(maxi, points);
            }
        }
        return dp[day][lastTask] = maxi;
    }
    public int ninjaTraining(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][4];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return maxPoints(n-1, 3, matrix, dp);
    }
}
