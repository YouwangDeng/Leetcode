//Solution 1 two pointers slow and fast
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (true) {
            slow = next(slow);
            fast = next(next(fast));
            if (slow == fast) {
                if (slow == 1) return true;
                else return false;
            }
        }
        
    }
    
    private int next(int n) {
        int sumOfSquares = 0;
        while (n != 0) {
            int a = n % 10;
            sumOfSquares += a * a;
            n /= 10;
        }
        return sumOfSquares;
    }
}