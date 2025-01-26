class Solution {
    public boolean hasAlternatingBits(int n) {
          while(n>0){
             int r1=n%2;
             n=n>>1;
             int r2=n%2;
             if((r1^r2)==0){ // alternate bits
                 return false;
             }
          }
          return true;
    }
}
