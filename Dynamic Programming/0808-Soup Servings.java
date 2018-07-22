//Solution 1 use recursive memoration DP solution
class Solution {
    public double soupServings(int N) {
        if (N > 5000) {  // trick
            return 1.0;
        }
        return helper(N, N, new Double[N + 1][N + 1]);
    }
    
    public double helper(int A, int B, Double[][] memo) {
        if (A <= 0 && B <= 0) return 0.5;     // base case 1
        if (A <= 0) return 1.0;               // base case 2
        if (B <= 0) return 0.0;               // base case 3
        if (memo[A][B] != null) {
            return memo[A][B];
        }
        int[] serveA = {100, 75, 50, 25};
        int[] serveB = {0, 25, 50, 75};
        memo[A][B] = 0.0;
        for (int i = 0; i < 4; i++) {
            memo[A][B] += helper(A - serveA[i], B - serveB[i], memo);
        }
        return memo[A][B] *= 0.25;
    }
}