package dynamicPgm;

public class GfgSubsetSumProblem {
    static Boolean[][] dp;
    static Boolean check(int[] arr, int sum, int n,int tempSum){
        if(sum == tempSum) return true;
        if(n == 0) return false;
        if(dp[n][tempSum] != null) return dp[n][tempSum];
        if(tempSum+arr[n-1] <= sum){
            // pick the element
            Boolean pick = check(arr,sum,n-1, tempSum+arr[n-1]);
            // not pick the element
            Boolean skip = check(arr,sum,n-1,tempSum);
            dp[n][tempSum] = pick || skip;
        }
        else{
            return check(arr,sum,n-1,tempSum);
        }
        return dp[n][tempSum];
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        dp = new Boolean[n+1][sum+1];

        return check(arr,sum,n,0);

    }
}
