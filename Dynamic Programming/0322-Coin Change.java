//Solution 1 knapsack DP solution
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount<1) return 0;
        int L = coins.length;
        int[] dp = new int[amount+1];
        int sum = 0;
        Arrays.sort(coins);
        while(++sum <= amount) {
            int min = -1;
            for(int coin : coins) {
                 // Modification
                if(sum < coin) break;
                if(dp[sum-coin]!=-1) {
                    int temp = dp[sum-coin]+1;
                    min = min<0 ? temp : (temp < min ? temp : min);
                }
            }
            dp[sum] = min;
        }
        return dp[amount];
    }
}