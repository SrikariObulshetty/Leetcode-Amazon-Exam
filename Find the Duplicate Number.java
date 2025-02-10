class Solution {
    public int findDuplicate(int[] nums) {
        // fast - slow pointer algorithm.
        int slow=nums[0];
        int fast=nums[0];
        boolean flag=true;
        while(fast!=slow || flag){
            flag=false;
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        System.out.println(slow+" "+fast);
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
        
        


    }
