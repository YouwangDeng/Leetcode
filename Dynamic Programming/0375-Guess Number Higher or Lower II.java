//Solution 1 minMax DP solution
public class Solution {
    int[][] dp;
    public int getMoneyAmount(int n) {
        dp = new int[n+1][n+1];
        return getMoneyAmount(1, n);
    }
    private int getMoneyAmount(int lower, int upper) {
        if (lower >= upper) {
            return 0;
        }
        if (dp[lower][upper] != 0) {
            return dp[lower][upper];
        }
        int maximum = Integer.MAX_VALUE;
        for (int i = lower; i <= upper; i++) {
            maximum = Math.min(maximum, Math.max(getMoneyAmount(lower, i-1), getMoneyAmount(i+1, upper)) + i);
        }
        dp[lower][upper] = maximum;

        return maximum;
    }
}