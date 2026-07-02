class Solution {
    public class Pair{
        int row;
        int col;
        int h;
        Pair(int row, int col, int h){
            this.row = row;
            this.col = col;
            this.h = h;
        }
    }
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        boolean ans = false;

        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> Integer.compare(b.h, a.h));

        boolean[][] vis  = new boolean[grid.size()][grid.get(0).size()];

        if(grid.get(0).get(0) == 1){
            q.add(new Pair(0,0,health-1));
        }
        else q.add(new Pair(0,0, health));

        vis[0][0] = true;

        int[] nr = {1, -1, 0, 0};
        int[] nc = {0, 0, 1, -1};

        while(q.size()>0){
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int h = p.h;

            if(r==grid.size()-1 && c==grid.get(0).size()-1 && h>=1){
                return true;
            }
            

            for(int i=0;i<4;i++){
                int newr = r + nr[i];
                int newc = c + nc[i];
                if(newr>=0 && newc>=0 && newr<grid.size() && newc<grid.get(0).size()){
                    if(grid.get(newr).get(newc) == 1 && !vis[newr][newc]){
                        q.add(new Pair(newr, newc, h-1));
                        vis[newr][newc] = true;
                    }
                    else if(grid.get(newr).get(newc) == 0 && !vis[newr][newc]){
                        q.add(new Pair(newr, newc, h));
                        vis[newr][newc] = true;
                    }
                }
            }
        }

        return false;


    }
}