package dynamicPgm;

public class GfgFrogJump {
    int minCost(int[] height) {
        int n = height.length;
        if(n == 0 || n == 1) return 0;
        int[] dp = new int[n];
        int prev2 = 0;
        int prev = Math.abs(height[0]-height[1]);
        for(int i = 2; i<n; i++){
            int jumpOne = prev + Math.abs(height[i] - height[i-1]);
            int jumpTwo = prev2 + Math.abs(height[i] - height[i-2]);
            prev2 = prev;
            prev = Math.min(jumpOne, jumpTwo);
        }
        return prev;
    }
}
