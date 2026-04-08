class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int m = grid.length, n = grid[0].length;
        int t = grid[row][col];

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        vis[row][col] = true;

        int[][] original = new int[m][n];
        for(int i = 0; i < m; i++) {
            original[i] = grid[i].clone();
        }


        if(row==0 || col==0 || row==grid.length-1 || col==grid[0].length-1){
            original[row][col] = color;
        }
        else if(grid[row-1][col]!=t || grid[row+1][col]!=t  || grid[row][col-1]!=t || grid[row][col+1]!=t){
            original[row][col] = color;
        }
        
        
        int[] nr = {1, -1, 0, 0};
        int[] nc = {0, 0, 1, -1};

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            
            for(int i=0;i<4;i++){
                int rr = r + nr[i];
                int cc = c + nc[i];

                if(rr>=0 && cc>=0 && rr<grid.length && cc<grid[0].length && !vis[rr][cc] && grid[rr][cc]==t){
                

                if(rr==0 || cc==0 || rr==grid.length-1 || cc==grid[0].length-1){
                    original[rr][cc] = color;
    
                }
                else if(grid[rr-1][cc]!=t || grid[rr+1][cc]!=t  || grid[rr][cc-1]!=t || grid[rr][cc+1]!=t){
                    original[rr][cc] = color;
                    
                }
                vis[rr][cc] = true;
                q.add(new Pair(rr, cc));
                }
            
                
                
            }
        }
        return original;
    }
}