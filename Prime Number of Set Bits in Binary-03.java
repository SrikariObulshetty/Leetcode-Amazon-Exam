class Solution {
    public int countPrimeSetBits(int left, int right) {
          HashSet<Integer>set=new HashSet<>();
          set.addAll(Arrays.asList(new Integer[] {2,3,5,7,11,13,17,19,23,29,31}) );
          int ans=0;
          for(int i=left;i<=right;i++){
              int leftShift=1;
              int count=0;
              while(leftShift<=i){
                   if( (leftShift & i)>0){
                        count++;
                   }
                   leftShift=leftShift<<1;
              }
              if(set.contains(count)){
                  ans++;
              }

          }
          return ans;

    }
}
