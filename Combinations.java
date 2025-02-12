class Solution {
    public static void combinations(List<List<Integer>>ans, int n, int k, int curr, List<Integer>list){
      if(list.size()==k){
          ans.add(new ArrayList<>(list));
          return;
      }
      for(int i=curr+1; i<=n;i++){
          list.add(i);
          combinations(ans, n, k, i, list);
          list.remove(list.size()-1);
      }

    }
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer>list=new ArrayList<>();
         combinations(ans, n, k, 0, list);
         return ans;
    }
}
