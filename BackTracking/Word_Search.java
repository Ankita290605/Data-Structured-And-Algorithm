class Solution {
    public boolean find(int i, int j, int indx, String word, char[][] board){
        if(indx==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length) return false;
        if(board[i][j] != word.charAt(indx)) return false;

        int[][] dir = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};

        char temp = board[i][j];
        board[i][j] = '$'; 

        for (int d = 0; d < 4; d++) {
        int row = i + dir[d][0];
        int col = j + dir[d][1];

            if(find(row, col, indx+1, word, board)){
                return true;
            }

        }
         board[i][j] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && find(i, j, 0, word, board)){
                    return true;
                }
            }
        }

        return false;
        
    }
}