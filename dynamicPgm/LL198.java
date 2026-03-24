package dynamicPgm;

public class LL198 {
    //  Memorization
    // public int amount(int[] nums, int i,int[] dp){
    //     if(i>= nums.length) return 0;
    //     if(dp[i] != -1) return dp[i];
    //     int take = nums[i] + amount(nums,i+2,dp);
    //     int skip = amount(nums,i+1,dp);
    //     return dp[i] = Math.max(take,skip);
    // }
    // public int rob(int[] nums) {
    //     // i varies from 0 to nums.length-1
    //     int[] dp = new int[nums.length];
    //     Arrays.fill(dp,-1);
    //     return amount(nums,0,dp);
    // }

    // Tabulation
    public int rob(int[] nums){
        int[] dp = new int[nums.length];
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int prev2 = nums[0];
        int prev = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++){
            int current = Math.max(nums[i]+prev2,prev);
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
}
