//Solution 1 use 2D DP solution
class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for(int j = 1; j < n + 1; j++) {
            if(pc[j - 1] == '*') dp[0][j] = dp[0][j - 1]; //key point
        }   
      
        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(pc[j - 1] == sc[i - 1] || pc[j - 1] == '?'){
                    dp[i][j] = dp[i - 1][j - 1];
                } else if(pc[j - 1] == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[m][n];
    }
}