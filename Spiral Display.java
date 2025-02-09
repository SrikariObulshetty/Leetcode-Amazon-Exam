class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
          int m=mat.length;
          int n=mat[0].length;
          int sr=0,dr=m-1;
          int sc=0,dc=n-1;
          int count=m*n;
          List<Integer>ans=new ArrayList<>();
          while(count >0){ // or sc<dc || sr<dr
               // iterate in row from sr to dr
               for(int i=sc;i<=dc && count>0;i++){
                    ans.add(mat[sr][i]);
                    count--;
               }
               sr++;
               //iterate col wise from top top bottom
               for(int j=sr;j<=dr && count>0;j++){
                   ans.add(mat[j][dc]);
                   count--;
               }
               dc--;
               // iterate backwards from dc to sc
               for(int i=dc;i>=sc && count>0;i--){
                   ans.add(mat[dr][i]);
                   count--;
               }
               dr--;
               // iterate up from dr to sr
                for(int j=dr;j>=sr && count>0;j--){
                    ans.add(mat[j][sc]);
                    count--;
                }
                sc++;
               
          }
          return ans;
    }
}
