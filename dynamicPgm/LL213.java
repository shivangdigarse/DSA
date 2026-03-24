package dynamicPgm;
import java.util.Arrays;

public class LL213 {
    public int amount(int[] nums, int i, int n, int[] dp){
        if(i>n) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + amount(nums, i+2, n, dp);
        int skip = amount(nums, i+1, n, dp);
        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int r1 = amount(nums, 0, n-2, dp);
        Arrays.fill(dp,-1);
        int r2 = amount(nums, 1, n-1, dp);
        return Math.max(r1,r2);
    }
}
