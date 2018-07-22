//Solution 1 use standard DP solution
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] s) {
        long[] dp = new long[s.length + 1];
        dp[0] = startFuel;
        for (int i = 0; i < s.length; i++)
            for (int t = i; t >= 0 && dp[t] >= s[i][0]; t--)// "--" key point
                dp[t + 1] = Math.max(dp[t + 1], dp[t] + s[i][1]);
        for (int t = 0; t <= s.length; ++t)
            if (dp[t] >= target) return t;
        return -1;
    }
}