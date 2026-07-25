class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];

        for(int[] ele : indices){
            int r = ele[0];
            int c = ele[1];

            for(int i=0;i<n;i++){
                ans[r][i]++;
            }
            for(int i=0;i<m;i++){
                ans[i][c]++;
            }
        }

        int a = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j]%2==1) a++;
            }
        }

        return a;
    }
}