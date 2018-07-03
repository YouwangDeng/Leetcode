//Solution 1 knapsack problem
class Solution {
    public boolean splitArraySameAverage(int[] A) {
        int sum = 0;
        for(int num : A){
            sum += num;
        }
        boolean[][] dp = new boolean[sum+1][A.length/2 + 1];
        dp[0][0] = true;
        for(int num : A){
            for(int i = sum; i >= num; i--){
                for(int j = 1; j <= A.length/2; j++){
                    dp[i][j] = dp[i][j] || dp[i-num][j - 1];//key point
                }
            }
        }
        for (int i = 1; i <= A.length/2; ++i) 
            if (sum*i%A.length == 0 && dp[sum*i/A.length][i]) return true;
        return false;
    }
}