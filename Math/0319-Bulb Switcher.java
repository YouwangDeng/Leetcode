//Solution 1 pure Math bulb is on only if it is toggled odd times so has odd divisors so is a square number
class Solution {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}