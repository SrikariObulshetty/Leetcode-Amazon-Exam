class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         // here if we use set size for deciding distinct subarray or not
         // there are some confusions, sp using set only to check whether ele is 
         // present or not nd using pointers to check the size of subarray
         int n=nums.length;
         HashSet<Integer>set=new HashSet<>();
         int l=0;
         long sum=0;
         long max=0;
         for(int r=0;r<n;r++){
             while(set.contains(nums[r]) || r-l+1>k){
                  // in both case we have to just update left ptr
                  // nd adjust sums, but nor update max
                  // bcoz either of these conditions must not be satisfied for us
                  set.remove(nums[l]);
                  sum-=nums[l++];
             }
             set.add(nums[r]);
             sum+=nums[r];
             if(r-l+1 == k){
                 max=Math.max(max, sum);
             }
         }
         return max;

    }
}
