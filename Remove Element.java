class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        // two pointers
        int i=0, j=n-1;
        int count=n; // to keep track of no.of variables wch are not equal to val
        while(i<=j){
            if(nums[i]==val){
                nums[i]=nums[j];
                count--; // we found val so total no.of elements decreases
                j--; // decrement only j coz at j also val myt be 
                // present, if we increment i also we myt miss some
            }
            else{
                i++;
            }
        }
        return count;
    }
}
