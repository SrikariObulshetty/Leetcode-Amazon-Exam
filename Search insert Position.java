class Solution {
    public int searchInsert(int[] nums, int target) {
         int n=nums.length;
         if(nums[0]>target){
            return 0; // tar insert position is '0'
         }
         else if(nums[n-1]<target){
             return n;
         }
         int l=0, h=n-1;
         while(l<=h){
            int mid= (l+h)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                 h=mid-1;
            }
            else{
                l=mid+1;
            }
         }
         return l;
    }
}
