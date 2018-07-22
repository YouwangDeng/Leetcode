//Solution 1 math formula DP solution
class Solution {
    public int numTilings(int N) {
        int M = 1000000007;
        int[] dp = new int[1000 + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        if (N <= 3) {
            return dp[N];
        }
        for (int i = 4; i <= N; i++) {
            dp[i] = 2 * dp[i - 1] % M + dp[i - 3] % M;
            dp[i] %= M;
        }
        return dp[N];
    }
}