class Solution {
    public static void bfs(char grid[][], int vis[][], int m, int n){
            vis[m][n]=1;
            Queue<int[]>q=new LinkedList<>();
             q.add(new int[]{m,n});
             int []dr={-1, 0, 1, 0};
             int dc[]= {0, 1, 0, -1};
             while(q.size()>0){
                  int []ele=q.poll();
                  int r=ele[0];
                  int c=ele[1];
                  // check for all 4 dir's of ele nd if '1' is present then mark it 
                  // means it is also in connected component.
                  // using dr and dc
                  for(int i=0;i<4;i++){
                        int nr=r + dr[i];
                        int nc=c + dc[i];
                        if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && vis[nr][nc]==0 && grid[nr][nc]=='1'){
                            vis[nr][nc]=1;
                            q.add(new int[]{nr, nc});
                        }
                  }
              }

         
    }
    public int numIslands(char[][] grid) {
          int count=0;
          int r=grid.length;
          int c=grid[0].length;
          int vis[][]=new int[r][c];
          for(int i=0;i<r;i++){
              for(int j=0;j<c;j++){
                    if(vis[i][j]==0 && grid[i][j]=='1'){
                        count++;
                        bfs(grid, vis,i,j);
                    }
              }
          }
          return count;
    }
}
