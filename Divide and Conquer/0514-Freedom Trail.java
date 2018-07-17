//Solution 1 classic DP solution
class Solution {
    public int findRotateSteps(String ring, String key) {
        int n = ring.length(), m = key.length();
        int[][] dp = new int[m + 1][n];
        int[][] clock = preproc(ring, 1), anti = preproc(ring, -1);
        for (int i = m - 1; i >= 0; i--) {
            int idx = key.charAt(i) - 'a';
            for (int j = 0; j < n; j++) { // fill dp[i][j]
                int p = clock[j][idx];
                int q = anti[j][idx];
                dp[i][j] = Math.min(dp[i + 1][p] + (j + n - p) % n, dp[i + 1][q] + (q + n - j) % n);//key point
            }
        }
        return dp[0][0] + m;
    }
    int[][] preproc(String r, int inc) {
        int n = r.length();
        int[][] ans = new int[n][26];
        int[] map = new int[26];
        for (int i = 0, j = 0; j < n * 2 - 1; j++) {
            map[r.charAt(i) - 'a'] = i;
            System.arraycopy(map, 0, ans[i], 0, 26);
            i = (i + inc + n) % n;
        }
        return ans;
    }
}