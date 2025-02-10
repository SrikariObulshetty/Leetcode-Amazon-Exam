class Solution {
    public static int helper(int nums[], int idx, int dp[]){
        if(idx<0){
            return 0;
        }
        // take.
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int take= nums[idx] + helper(nums, idx-2, dp);
        int notTake = helper(nums , idx-1, dp);
        dp[idx]= Math.max(take,notTake);
        return dp[idx];
        
    }
    public int rob(int[] nums) {
        // memoisation
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(nums, n-1, dp);
    }
}
