//Solution 1 use DP and direction vector O(m*n) must always be one direction
class Solution {
    private int[][] dir = {{ -1, 0}, {0, -1}, { -1, -1}, { -1, 1}};
    public int longestLine(int[][] M) {
        if (M.length == 0 || M[0].length == 0) return 0;
        int m = M.length, n = M[0].length;
        int max = 0;
        int[][][] dp = new int[m + 1][n + 2][4];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (M[i - 1][j - 1] == 0) continue;
                for (int k = 0; k < 4; k++) {
                    dp[i][j][k] = dp[i + dir[k][0]][j + dir[k][1]][k] + 1;
                    max = Math.max(max, dp[i][j][k]);
                }
            }
        }
        return max;
    }
}
//Solution 2 DP clever about the diag and anti-diag value O(m*n) much faster same idea with N-Queens
class Solution {
    public int longestLine(int[][] M) {
    if (M.length == 0 || M[0].length == 0) {
        return 0;
    }
    int max = 0;
    int[] col = new int[M[0].length];
    int[] diag = new int[M.length + M[0].length];
    int[] antiD = new int[M.length + M[0].length];
    for (int i = 0; i < M.length; i++) {
        int row = 0;
        for (int j = 0; j < M[0].length; j++) {
            if (M[i][j] == 1) {
                row++;
                col[j]++;
                diag[j + i]++;
                antiD[j - i + M.length]++;
                max = Math.max(max, row);
                max = Math.max(max, col[j]);
                max = Math.max(max, diag[j + i]);
                max = Math.max(max, antiD[j - i + M.length]);
            } else {
                row = 0;
                col[j] = 0;
                diag[j + i] = 0;
                antiD[j - i + M.length] = 0;
            }
        }
    }
    return max;
    }
}
