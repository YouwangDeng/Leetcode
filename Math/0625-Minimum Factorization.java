//Solution 1 from 9 to 2 solution
class Solution {
    public int smallestFactorization(int a) {
        if (a < 10) return a;
        long res = 0;
        for (long i = 9, f = 1; i > 1; i--)
            while (a % i == 0) {
                res += i * f;
                if (res > Integer.MAX_VALUE) return 0;
                a /= i;
                f *= 10;
            }
        return a == 1 ? (int)res : 0;
    }
}