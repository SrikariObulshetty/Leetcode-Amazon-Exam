class Solution {
    public int climbStairs(int n) {
         int dp[]=new int[n+1];
         dp[0]=1; 
         dp[1]=1; // only 1 way to reach 1 step
         for(int i=2;i<=n;i++){
            dp[i]=dp[i-1] + dp[i-2];
         }
         return dp[n];

           
    }
}
