class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=-1;
        int end=-1;
        int l=0;
        int u=nums.length-1;
        while(l<=u){
            int mid=(l+u)/2;
            if(nums[mid]==target){
                st=mid;
                end=mid;
                while(st>0 && nums[st-1]==target){
                    st--;
                }
                while(end<nums.length-1 && nums[end+1]==target){
                     end++;
                }
                break;
            }
            else if(nums[mid] > target){
                 u=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return new int[]{st, end};
    }
}
