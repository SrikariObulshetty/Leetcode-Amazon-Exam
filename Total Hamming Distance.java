class Solution {
    public static int onesNdZeros(int temp, int []nums,int n){
          int ones=0;
          int zeros=0;
          for(int i=0;i<n;i++){
               if( (temp & nums[i]) >0 ){ // 1 is present at that position
                     ones++;
               }
          }
          // here explicitly no need to calculate zeros
          // get from ones, zeros=n-ones;
          return (ones * (n-ones));
    }
    public int totalHammingDistance(int[] nums) {
           int ans=0;
           int n=nums.length;
           int temp=1;
           while(temp<(int)Math.pow(10,9) ){
                ans+=onesNdZeros(temp, nums,n);
                temp=temp<<1;
           }
           return ans;

    }
}
