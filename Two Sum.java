class Solution {
    public int[] twoSum(int[] nums, int target) {
           HashMap<Integer, Integer> map=new HashMap<>();
           // key is num
           // value is its idx
           int n=nums.length;
           for(int i=0;i<n;i++){
                int comp= target - nums[i];
                if(map.containsKey(nums[i])){
                     return new int[] {i, map.get(nums[i])};
                }
                map.put(comp, i);
           }
           return new int[0];
    }
}
