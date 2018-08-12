//Solution 1 BFS coloring solution
class Solution {
    int[] delta = {0, 1, 0, -1, 0};
    int minDist = -1;

    public int shortestDistance(int[][] grid) {
        if (grid == null || grid.length == 0 || 
            grid[0].length == 0) return minDist;
        int m = grid.length, n = grid[0].length;
        int[][] dist = new int[m][n];
        int walk = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) bfs(i, j, --walk, grid, dist);
            }
        }
        return minDist;
    }

    private void bfs(int i, int j, int walk, int[][] grid, int[][] dist) {
        minDist = -1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        int depth = 0;
        while (!q.isEmpty()) {
            depth++;
            int len = q.size();
            for (int k = 0; k < len; k++) {
                int[] pos = q.poll();
                for (int d = 0; d < 4; d++) {
                    int r = pos[0] + delta[d];
                    int c = pos[1] + delta[d + 1];
                    if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length
                        && grid[r][c] == walk) {
                        grid[r][c] = walk - 1;
                        dist[r][c] += depth;
                        if (minDist < 0 || minDist > dist[r][c]){
                            minDist = dist[r][c];
                        }
                        q.offer(new int[]{r, c});
                    }
                }
            }
        }
    }
}