class Solution {
    public int singleNumber(int[] nums) {
          int xor=0;
          for(int n:nums){
            xor^=n; // since all ele are twicw nd one is not 
            //if we do xor for same numbers it becomes 0
            // at last, the number wch doesn't occur twice will remain
          }
          return xor;
    }
}
