//Solution 1 math solution
//use i steps to reach maxA(i) then use the remaining n - i steps to reach n - i - 1 copies of maxA(i)
class Solution {
    public int maxA(int n) {
        int max = n;
        for (int i = 1; i <= n - 3; i++)
            max = Math.max(max, maxA(i) * (n - i - 1));
        return max;
    }
}