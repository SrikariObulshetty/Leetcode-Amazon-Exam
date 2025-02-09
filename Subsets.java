class Solution {
    public void findSubsets(List<List<Integer>>ans, int []nums, int n, List<Integer>subAns, int idx){
             if(idx==n){
                 ans.add(new ArrayList<>(subAns)); // should add like this only.
                 return;
             }
             // not take
             findSubsets(ans, nums, n, subAns, idx+1);
             // take
             subAns.add(nums[idx]);
             findSubsets(ans, nums, n, subAns, idx+1);
             subAns.remove(subAns.size()-1); // better way is this o.w will get error 
             // sometimes
             

    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans= new ArrayList<>();
         List<Integer>subAns=new ArrayList<>();
         int n=nums.length;
         findSubsets(ans, nums, n, subAns, 0);
         return ans;

    }
}
