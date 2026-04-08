class Solution {
    public int find(int x, int[] parent){
        if(parent[x]==x) return x;
        else return find(parent[x], parent);
    }
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1];
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
        }
        int[] ans = new int[2];
        for(int[] ele : edges){
            int i = ele[0];
            int j = ele[1];
            int x = find(i, parent);
            int y = find(j, parent);
            if(x==y){
                ans[0] = i;
                ans[1] = j;
            }
            if(x!=y) parent[y] = x;

        }

        return ans;
        
    }
}