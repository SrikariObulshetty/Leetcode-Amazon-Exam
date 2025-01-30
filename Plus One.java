class Solution {
    public int[] plusOne(int[] digits) {
         int n=digits.length;
         for(int i=n-1;i>=0;i--){
             if(digits[i]<9){
                 digits[i]++;
                 return digits;
             }
             digits[i]=0;
         }
         int ans[]=new int[n+1];
         ans[0]=1; // no need to touch others coz they will be however '0' by default
         return ans;
    }
}
