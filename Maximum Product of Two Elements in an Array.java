class Solution {
    public int maxProduct(int[] nums) {
         int max1=Integer.MIN_VALUE;
         int max2=max1;
         for(int n:nums){
             if(max1<=n){
                 max2=max1;
                 max1=n;
             }
             else if(n>max2){
                   max2=n;
             }
         }
         return (max1-1) * (max2-1);
    }
}
