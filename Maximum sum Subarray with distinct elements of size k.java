class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer>map=new HashMap<>(); // default size is 16
        long sum=0;
        long max=0;
        int j=0;
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            sum+=nums[i];
            if(i-j+1 > k){
                map.put(nums[j], map.get(nums[j])-1);
                if(map.get(nums[j]) == 0){
                    map.remove(nums[j]);
                }
                sum-=nums[j];
                j++;
            }
            if(map.size()==k){
                max=Math.max(sum, max);
            }
        }
        return max;

    }
}
