
class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int[][] dir = {{0,1}, {0,-1}, {1,0}, {-1,0}};

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 0 && !visited[i][j]) {

                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    visited[i][j] = true;

                    boolean closed = true;

                    while (!q.isEmpty()) {
                        int[] curr = q.poll();

                        int r = curr[0];
                        int c = curr[1];

                        if (r == 0 || c == 0 || r == m-1 || c == n-1) {
                            closed = false;
                        }

                        for (int[] d : dir) {
                            int nr = r + d[0];
                            int nc = c + d[1];

                            if (nr >= 0 && nc >= 0 &&
                                nr < m && nc < n &&
                                grid[nr][nc] == 0 &&
                                !visited[nr][nc]) {

                                visited[nr][nc] = true;
                                q.offer(new int[]{nr, nc});
                            }
                        }
                    }

                    if (closed) count++;
                }
            }
        }

        return count;
    }
}
                                    