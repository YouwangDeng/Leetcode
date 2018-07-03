//Solution 1 scenories analyse math solution
class Solution {
    public int reachNumber(int target) {
        long t = Math.abs(target);
        long n = (long) Math.ceil((-1.0 + Math.sqrt(1 + 8.0 * t)) / 2);

        long sum = n * (n + 1) / 2;
        long diff = sum - target;
        if (diff == 0) {
            return (int)n;
        } else if (diff % 2 == 0) {
            return (int)n;
        } else if ((diff + n + 1) % 2 == 0) {
            return (int)n + 1;
        } else {
            return (int)n + 2;
        }
    }
}