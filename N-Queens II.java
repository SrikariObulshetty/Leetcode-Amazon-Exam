class Solution {
    public boolean isSafe(int cb[], int cr, int cc){
        for(int i=cr-1;i>=0;i--){
            if(cb[i]==cc || ( Math.abs(cr-i) == Math.abs(cb[i]-cc)) ){
                 return false;
            }
        }
        return true;

    }
    public int nQueens(int cb[], int n,int cr, int qPlaced){
        if(cr==n){
            if(qPlaced==0) return 1;
            return 0;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(isSafe(cb, cr, i)){
                cb[cr]=i;
                ans+=nQueens(cb, n, cr+1, qPlaced-1);
                //cb[cr]=-1;
            }
        }
        return ans;

    }
    public int totalNQueens(int n) {
        int cb[]=new int[n];
        Arrays.fill(cb, -1);
        return nQueens(cb, n, 0, n);
    }
}
