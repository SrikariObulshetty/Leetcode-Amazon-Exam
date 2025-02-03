class Solution {
    public static int recursion(int []dp, int n){
        if(n<0){
            return 0;
        }
        else if(n==0){
            return 1; // one way of reaching exists from now
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=recursion(dp, n-1) + recursion(dp, n-2);
        return dp[n];  

    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[0]=1;
        return recursion(dp,n);
           
    }
}
