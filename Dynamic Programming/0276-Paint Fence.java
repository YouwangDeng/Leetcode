//Solution 1 Math DP solution
class Solution {
    public int numWays(int n, int k) {
        if (n < 1 || k < 1) return 0;
        if (n == 1) return k;
        int[] f = new int[n];
        f[0] = 1; f[1] = k;
        for (int i = 2; i < n; i++) 
            f[i] = (k - 1) *(f[i - 1] + f[i - 2]); 
        return k*f[n - 1];
    }
}