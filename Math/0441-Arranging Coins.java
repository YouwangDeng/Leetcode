//Solution 1 pure math solution
class Solution {
    public int arrangeCoins(int n) {
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }
}
//Solution 2 iteration O(sqrt(n))
class Solution {
    public int arrangeCoins(int n) {
        if(n < 1)
            return 0;
        for(int i = 1; ;i++){
            n -= i;
            if(n < 0) return i-1;
        }
    }
}

