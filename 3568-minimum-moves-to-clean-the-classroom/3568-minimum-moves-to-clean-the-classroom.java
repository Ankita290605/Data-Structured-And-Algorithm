class Solution {
    public int minMoves(String[] classroom, int energy) {

        int n = classroom.length;
        int m = classroom[0].length();

        char[][] arr = new char[n][m];

        int sr = 0, sc = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr[i][j] = classroom[i].charAt(j);

                if (arr[i][j] == 'S') {
                    sr = i;
                    sc = j;
                }

                if (arr[i][j] == 'L') {
                    count++;
                }
            }
        }
        int[][] litterId = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                litterId[i][j] = -1;
            }
        }

        int id = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    litterId[i][j] = id++;
                }
            }
        }

        boolean[][][][] visited =
                new boolean[n][m][1 << count][energy + 1];

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{sr, sc, energy, 0, 0});

        visited[sr][sc][0][energy] = true;

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        int allCollected = (1 << count) - 1;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int e = curr[2];
            int mask = curr[3];
            int moves = curr[4];

            if (mask == allCollected) {
                return moves;
            }

            for (int d = 0; d < 4; d++) {

                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    continue;
                }

                if (arr[nr][nc] == 'X') {
                    continue;
                }

                if (e == 0) {
                    continue;
                }

                int newEnergy = e - 1;
                int newMask = mask;

                if (arr[nr][nc] == 'L') {

                    int litter = litterId[nr][nc];

                    newMask = newMask | (1 << litter);
                }

                if (arr[nr][nc] == 'R') {
                    newEnergy = energy;
                }

                if (!visited[nr][nc][newMask][newEnergy]) {

                    visited[nr][nc][newMask][newEnergy] = true;

                    q.add(new int[]{
                            nr,
                            nc,
                            newEnergy,
                            newMask,
                            moves + 1
                    });
                }
            }
        }

        return -1;
    }
}