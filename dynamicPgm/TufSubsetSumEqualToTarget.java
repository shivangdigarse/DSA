package dynamicPgm;

public class TufSubsetSumEqualToTarget {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        //your code goes here
        int n = nums.length;
        boolean[] dp = new boolean[k+1];
        dp[0] = true;
        for(int ele : nums){
            for(int j = k; j>= ele; j--){
                if(dp[j-ele]){
                    dp[j] = true;
                }
            }
        }
        return dp[k];
    }
}
