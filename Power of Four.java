class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        double ans=Math.log(n) / Math.log(4);
        return ans==(int)ans;


    }
}
