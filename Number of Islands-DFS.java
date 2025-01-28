class Solution {
    public static void dfs(char grid[][], int r, int c){
         if(r<0 || r>=grid.length || c<0 || c>=grid[0].length){
               return;
         }
         // instead of using vis arr, we r changing value from 0
         if(grid[r][c]=='1'){
             grid[r][c]='*';
             dfs(grid, r-1, c); // top
             dfs(grid, r+1, c); //down
             dfs(grid, r, c-1); // left
             dfs(grid, r, c+1); // right
         }
    }
    public int numIslands(char[][] grid) {
         //now change the grid, once ele with 1 is visited
         int r=grid.length;
         int c=grid[0].length;
         int count=0;
         for(int i=0;i<r;i++){
              for(int j=0;j<c;j++){
                   if(grid[i][j]=='1'){
                      dfs(grid,i,j);
                      grid[i][j]='*';
                      count++;
                   }
              }
         }
         return count;
    }
}
