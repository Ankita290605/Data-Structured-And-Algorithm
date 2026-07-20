class Solution {
    public void rotate(int i, int j, int[] arr){
        while(i<j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }
        int[] arr = new int[m*n];
        int s = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[s] = grid[i][j];
                s++;
            }
        }

        k = k%(m*n);
        int len = arr.length;
        rotate(0, len-k-1, arr);
        rotate(len-k, len-1, arr);
        rotate(0, len-1, arr);
        s = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans.get(i).add(arr[s]);
                s++;
            }
        }

        return ans;
    }
}