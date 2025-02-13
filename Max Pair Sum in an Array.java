class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int ans=-1;
        int dig[]=new int[10];
        Arrays.fill(dig, -1);
        for(int k:nums){
            int tmp=k;
            int larDig=0;
            while(tmp>0){
                larDig=Math.max(tmp%10, larDig);
                tmp/=10;
            }
            if(dig[larDig] ==-1){
                dig[larDig]=k;
            }
            else{
               ans=Math.max(ans, dig[larDig] + k);
               dig[larDig]=Math.max(k, dig[larDig]);
            }
        }
        return ans;
    }
}
