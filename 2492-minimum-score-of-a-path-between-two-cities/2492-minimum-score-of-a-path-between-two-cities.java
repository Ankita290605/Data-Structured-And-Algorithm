class Solution {
    class Pair{
        int node;
        int dist;
        Pair(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    public int minScore(int n, int[][] roads) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] q : roads){
            int u = q[0];
            int v = q[1];
            int d = q[2];
            adj.get(u).add(new Pair(v,d));
            adj.get(v).add(new Pair(u,d));
        }

        int[] r = {1, -1, 0, 0};
        int[] c = {0, 0, 1, -1};

        Queue<Integer> pq = new LinkedList<>();
        boolean[] vis = new boolean[n+1];
        pq.add(1);
        vis[1] = true;
        
        int ans = Integer.MAX_VALUE;

        while(!pq.isEmpty()){
            int curr = pq.poll();

            for(Pair p : adj.get(curr)){
                ans = Math.min(ans, p.dist);

                if(!vis[p.node]){
                    pq.add(p.node);
                    vis[p.node] = true;
                }
            }
        }
        return ans;
    }
} 