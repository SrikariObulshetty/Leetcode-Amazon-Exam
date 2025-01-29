class Solution {
       
    public static boolean checkRowCol(char [][]board, int r, int c){
         for(int i=0;i<9;i++){
             if(i!=r && board[r][c]==board[i][c]){ // checking in col
                 return false;
             }
              if(i!=c && board[r][c]==board[r][i]){ // checking in row
                  return false;
              }
         }
         return true;
    }

    public static boolean checkBox(char [][]board, int r, int c){
          int st_row=(r/3)*3;
          int st_col=(c/3)*3;
          for(int i=st_row;i<st_row+3;i++){
                for(int j=st_col;j<st_col+3;j++){
                     if(i!=r && j!=c && board[i][j]==board[r][c]){
                          return false;
                     }
                }
          }
          return true;

    }
    public boolean isValidSudoku(char[][] board) {
         for(int i=0;i<9;i++){
             for(int j=0;j<9;j++){
                 if(board[i][j]!='.'){
                      if(!checkRowCol(board,i,j)) return false;
                      if(!checkBox(board, i, j)) return false;
                 }
             }
         }
         return true;
    }
}
