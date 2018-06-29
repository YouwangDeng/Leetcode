//Solution 1 use recursion find how many 5 is there in n
/*n/5 = number of terms contributing one 5s in above sequence
n/5^2 (or n/5/5) = number of terms contributing two 5s in above sequence (their one 5 is included in above)
n/5^3 (or n/5/5) = number of terms contributing three 5s in above sequence (their two 5s is included in above)
n/5^y = number of terms contributing y 5s in above sequence (their y-1 5s is included in above*/
class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
//Solution 2 use iteration
class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        int tmp = 0;
        while(n / 5 > 0) {
            tmp = n / 5;
            sum += tmp;
            n = tmp;
        }
        return sum;
    }
}