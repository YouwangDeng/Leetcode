//Solution 1 implement pow use recursion avoid overflow
class Solution {
    public double myPow(double x, int n) {
		if (n == 0)
			return 1.;
		if (n < 0) {
			n = -n;
			x = 1. / x;
		}
		if (Double.isInfinite(x)) 
			return 0.;
		return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
	}
}