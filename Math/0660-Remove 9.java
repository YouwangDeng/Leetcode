//Solution 1 every nine numbers value every ten a round
class Solution {
    public int newInteger(int n) {
        int ans = 0;
        int base = 1;

        while (n > 0){
            ans += n % 9 * base;
            n /= 9;
            base *= 10;
        }
        return ans;
    }
}