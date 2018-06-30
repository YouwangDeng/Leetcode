//Solution 1 pure math solution O(sqrt(n))
class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
//Solution 2 use binary search O(log(n))
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num <= 0) return false;
        int l = 1, r = num;
        while (l < r) {
            int m = l + (r - l) / 2 + 1;
            if (num / m >= m) l = m;
            else r = m - 1;
        }
        return l * l == num;
    }
}