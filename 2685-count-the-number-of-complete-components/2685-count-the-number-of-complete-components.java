class Solution {
    public boolean bfs(List<List<Integer>> adj, int i, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> com = new ArrayList<>();
        q.add(i);
        vis[i] = true;

        while(!q.isEmpty()){
            int curr = q.poll();
            com.add(curr);

            for(int ele : adj.get(curr)){
                if(!vis[ele]){
                    vis[ele] = true;
                    q.add(ele);
                }
            }
        }

        int s = com.size();
        for(int ele : com){
            if(adj.get(ele).size()!=s-1){
                return false;
            }
        }

        return true;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int ans = 0;
        boolean[] vis = new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i]){
                boolean flag = bfs(adj, i, vis);
                if(flag) ans++;
            }
        }

        return ans;
    }
}