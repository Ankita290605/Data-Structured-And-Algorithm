class Solution {
    class Pair{
        int ele;
        int indx;
        Pair(int ele, int indx){
            this.ele = ele;
            this.indx = indx;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> Integer.compare(b.ele, a.ele));
        for(int i=0;i<score.length;i++){
            q.add(new Pair(score[i], i));
        }

        String[] ans = new String[score.length];

        int rank = 1;

        while(!q.isEmpty()){
            Pair p = q.poll();
            int n = p.ele;
            int i = p.indx;

            if(rank==1){
                ans[i] = "Gold Medal";
            }
            else if(rank==2){
                ans[i] = "Silver Medal";
            }
            else if(rank==3){
                ans[i] = "Bronze Medal";
            }
            else{
                ans[i] = String.valueOf(rank);
            }
            rank++;
        }

        return ans;
        
    }
}