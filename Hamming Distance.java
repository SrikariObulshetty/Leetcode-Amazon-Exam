class Solution {
    public int hammingDistance(int x, int y) {
        int xor=0;
        int cnt=0;
        int mask=1;
        while(x!=0 || y!=0){
            if( (mask & x) != (mask & y)){
                   cnt++;
            }
            x=x>>1;
            y=y>>1;
        }
        return cnt;
    }
}
