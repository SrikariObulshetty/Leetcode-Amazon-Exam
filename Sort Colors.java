class Solution {
    public static void swap(int nums[], int a, int b){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public void sortColors(int[] nums) {
        int i=0,k=nums.length-1;
        int j=0;
        // 0 to i-1 -> 0's
        // j+1 to k -> 2's
        // i t0 j ->1's
        while(j<=k){
            if(nums[j]==0){
                // swap with i nd incre i;
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j++;
            }
            else if(nums[j]==1){
                j++;
            }
            else{ // it is 2
                 int t=nums[j];
                 nums[j]=nums[k];
                 nums[k]=t;
                 k--;
            }
        }
    }
}
