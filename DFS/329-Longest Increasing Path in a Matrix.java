//solution 1  Memoization & DFS solution
class Solution {
    public static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] memo = new int[m][n];
        int max = 1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int len = dfs(matrix, i, j, m, n, memo);
                max = Math.max(max, len);
            }
        }   
        return max;
    }

    public int dfs(int[][] matrix, int i, int j, int m, int n, int[][] memo) {
        if(memo[i][j] != 0) return memo[i][j];
        int max = 1;
        for(int[] dir: dirs) {
            int x = i + dir[0], y = j + dir[1];
            if(x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] <= matrix[i][j]) continue;
            int len = 1 + dfs(matrix, x, y, m, n, memo);
            max = Math.max(max, len);
        }
        memo[i][j] = max;
        return max;
    }
}