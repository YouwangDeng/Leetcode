//Solution 1 pure math proof
import java.math.*;
class Solution {
    public String smallestGoodBase(String n) {
        long num = Long.valueOf(n);
        BigInteger bn = BigInteger.valueOf(num);
        int max_m = (int) (Math.log(num) / Math.log(2));
        for (int m = max_m; m >= 1; m--) {
            BigInteger k = BigInteger.valueOf((long) Math.floor(Math.pow(num, 1.0 / m)));
            BigInteger left = k.pow(m + 1).subtract(BigInteger.ONE);
            BigInteger right = bn.multiply(k.subtract(BigInteger.ONE));
            if (left.equals(right)) {
                return String.valueOf(k);
            }
        }
        return String.valueOf(num - 1);
    }
}