class Solution {
    class Pair{
        int row;
        int col;
        int obs;
        int dist;
        Pair(int row, int col, int obs, int dist){
            this.row = row;
            this.col = col;
            this.obs = obs;
            this.dist = dist;
        }
    }
    public int minimumObstacles(int[][] grid) {
        int ans = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.obs != b.obs) return a.obs - b.obs;
            else return a.dist - b.dist; 
        });

        int[][] dist = new int[grid.length][grid[0].length];
        for(int[] ele : dist) {
            Arrays.fill(ele, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        pq.add(new Pair(0, 0, 0, 0));

        int[] nr = {1, -1, 0, 0};
        int[] nc = {0, 0, 1, -1};

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int r = curr.row;
            int c = curr.col;
            int b = curr.obs;
            int d = curr.dist;

            if(r==grid.length-1 && c==grid[0].length-1) return b;
            for(int i=0;i<4;i++){
                int rr = r + nr[i];
                int cc = c + nc[i];

                if(rr>=0 && cc>=0 && rr<grid.length && cc<grid[0].length){
                    if(dist[rr][cc] > d + 1){
                        dist[rr][cc] = d + 1;
                        pq.add(new Pair(rr, cc, grid[rr][cc]+b, dist[rr][cc]));
                    }
                }
            }
        }
        return -1;
    }
}