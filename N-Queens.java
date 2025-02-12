class Solution {
    public static boolean isSafe(int cb[], int cr, int cc){
          for(int i=cr-1;i>=0;i--){
              if(cb[i]==cc || ( Math.abs(cr-i) == Math.abs(cb[i]-cc) ) ){
                  return false;
              }
          }
          return true;


    }
    public static void nQueens(int n, int[] cb, List<List<String>>ans, int cr, int qPlaced){
        if(cr==n){
            if(qPlaced==0){
                List<String> subAns=new ArrayList<>();
                for(int i=0;i<n;i++){
                    String str="";
                    for(int j=0;j<n;j++){
                        if(cb[i]==j){
                           str+="Q";
                        }
                        else{
                            str+=".";
                        }
                    }
                    subAns.add(str);
                }
                ans.add(subAns);
            }
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(cb, cr,i)==true){
                cb[cr]=i;
                nQueens(n, cb, ans, cr+1, qPlaced-1);
                cb[cr]=-1;
            }

        }
    }
    public List<List<String>> solveNQueens(int n) {
          List<List<String>>ans=new ArrayList<>();
          int cb[]=new int[n];
          Arrays.fill(cb, -1);
          nQueens(n, cb, ans, 0, n);
          return ans;
    }
}
