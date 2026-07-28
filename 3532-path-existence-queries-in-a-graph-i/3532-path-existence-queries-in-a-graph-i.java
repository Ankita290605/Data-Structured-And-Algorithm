class Solution {
    public int find(int x, int[] parent){
        if(parent[x]==x){
            return x;
        }

        return parent[x] = find(parent[x], parent);
    }

    public void union(int x, int y, int parent[]){
        int xp = find(x, parent);
        int yp = find(y, parent);

        if(xp!=yp){
            parent[yp] = xp;
        }
    }
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
    
        int[] parent = new int[nums.length];
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
        }

        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])<=maxDiff){
                union(i,i+1, parent);
            }
        }

        boolean[] ans = new boolean[queries.length];
        int indx = 0;
        for(int[] ele : queries){
            int i = ele[0];
            int j = ele[1];

            if(find(i, parent)==find(j, parent)){
                ans[indx] = true;
                indx++;
            }
            else{
                ans[indx] = false;
                indx++;
            }
        }

        return ans;
        
    }
}