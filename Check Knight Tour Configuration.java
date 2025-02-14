class Solution {
    public static boolean check(int [][]grid, int n, int r, int c, int count){
        if(r<0 || r>=n || c<0 || c>=n || grid[r][c]!=count){
            return false;
        }
        else if(count== (n*n)-1) return true;
        // check all 8 directions.
         boolean d1 = check(grid, n, r-2, c+1, count+1);
         boolean d2= check(grid, n, r-1, c+2, count+1);
         boolean d3=check(grid, n, r+1, c+2, count+1);
         boolean d4=check(grid, n, r+2, c+1, count+1);
         boolean d5 = check(grid, n, r+2, c-1, count+1);
         boolean d6= check(grid, n, r+1, c-2, count+1);
         boolean d7=check(grid, n, r-1, c-2, count+1);
         boolean d8=check(grid, n, r-2, c-1, count+1);
         return d1 || d2 || d3 || d4 || d5 || d6 || d7 || d8;




    }
    public boolean checkValidGrid(int[][] grid) {
         int n=grid.length;
         return check(grid, n, 0, 0, 0);
        
    }
}
