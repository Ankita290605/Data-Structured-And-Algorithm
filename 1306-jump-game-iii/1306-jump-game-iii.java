class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        boolean vis[] = new boolean[arr.length];
        
        while(!q.isEmpty()){
            int indx = q.poll();
            vis[indx] = true;
            int curr = arr[indx];
            if(curr==0){
                return true;
            }

            if((indx+curr < arr.length) && (indx+curr>=0) && !vis[indx+curr]) q.add(indx+curr);
            if((indx-curr < arr.length) && (indx-curr>=0) && !vis[indx-curr]) q.add(indx-curr);
        }

        return false;
    }
}