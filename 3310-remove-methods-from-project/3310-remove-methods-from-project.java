class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] ele : invocations){
            adj.get(ele[0]).add(ele[1]);
        }
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        vis[k] = true;
        while(!q.isEmpty()){
            int c = q.poll();
        
            for(int i : adj.get(c)){
                if(!vis[i]){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(!vis[i]){
                for(int j : adj.get(i)){
                    if(vis[j]){
                        for(int x=0;x<n;x++){
                            ans.add(x);
                        }
                        return ans;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            if(!vis[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}