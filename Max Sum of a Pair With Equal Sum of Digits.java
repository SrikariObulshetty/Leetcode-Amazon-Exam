class Solution {
    public int maximumSum(int[] nums) {
        int arr[]=new int[82]; // max sum of digits is this only
        int ans=-1;
        for(int n:nums){
            int k=n;
            int sum=0;
            while(k>0){
                sum+=k%10;
                k/=10;
            }
            if(arr[sum]!=0){
                int pairSum=n + arr[sum];
                ans=Math.max(ans, pairSum);
            }
            arr[sum]=Math.max(arr[sum], n);
             
        }
        return ans;
    }
}
