class Solution {
    public void backT(int[][] grid, int count, int nonObs, int i, int j, int[] ans){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==-1) return;
        if(grid[i][j]==2){
            if(count==nonObs){
                ans[0]++;
            }
            return;
        }

        grid[i][j] = -1;
       
        int[][] dir = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};

        for(int[] d : dir){
            int row = i + d[0];
            int col = j + d[1];

            backT(grid, count+1, nonObs, row, col, ans);
        }

        grid[i][j] = 0;
        return;

    }
    public int uniquePathsIII(int[][] grid) {
        int nonObs = 0;
        int x = -1;
        int y = -1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) nonObs++;
                if(grid[i][j]==1){
                    x = i;
                    y = j;
                }
            }
        }
        nonObs += 1;
        int[] ans = new int[1];
        backT(grid, 0, nonObs, x, y, ans);
        return ans[0];
    }
}