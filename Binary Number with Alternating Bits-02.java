class Solution {
    public boolean hasAlternatingBits(int n) {
          int prevBit=n&1;
          while(n>0){
            n=n>>1;
            if(prevBit==(n&1)){
                return false;
            }
            //update prevBit value
            prevBit=(n&1);
          }
          return true;
    }
}
