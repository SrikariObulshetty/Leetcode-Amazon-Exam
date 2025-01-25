class Solution {
    public int hammingWeight(int n) {
          int ans=0;
          long l=1;
          while(l<=n){
              if( (l&n) !=0) {
                   ans++;
              }
              l=l<<1;
          }
          return ans;
    }

}
