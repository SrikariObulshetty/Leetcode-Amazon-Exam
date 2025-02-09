class Solution {
    public static int subsetsXOR(int nums[], int idx, int n, int ans){
           if(idx==n){
             return ans;
           }
           int notTake =subsetsXOR(nums, idx+1, n, ans);
           int take=subsetsXOR(nums, idx+1, n, ans^nums[idx]);
           return take + notTake; 
    }
    public int subsetXORSum(int[] nums) {
        // idea to generate all possible subsets.
        return subsetsXOR(nums, 0, nums.length, 0);

    }
}
