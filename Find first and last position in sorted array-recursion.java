class Solution {
    public static int firstIdx(int nums[], int target, int l, int h, int idx){
         if(l>h){
            return idx;
         }
         int mid=(l+h)/2;
         if(nums[mid]==target){
             return firstIdx(nums, target, l, mid-1, mid);
         }
         else if(nums[mid]<target){
             return firstIdx(nums, target, mid+1, h, idx);
         }
         else{
             return firstIdx(nums, target, l, mid-1, idx);
         }
         
    }
    public static int lastIdx(int nums[], int target, int l, int h, int idx){
         if(l>h){
            return idx;
         }
         int mid=(l+h)/2;
         if(nums[mid]==target){
             return lastIdx(nums, target, mid+1, h, mid);
         }
         else if(nums[mid]<target){
             return lastIdx(nums, target, mid+1, h, idx);
         }
         else{
             return lastIdx(nums, target, l, mid-1, idx);
         }
         
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        if(n==0){
            return new int[]{-1,-1};
        }
          int firstIdx=firstIdx(nums, target, 0, n-1, -1);
          int lastIdx=lastIdx(nums, target, 0, n-1,-1);
          return new int[]{firstIdx, lastIdx};
    }
}
