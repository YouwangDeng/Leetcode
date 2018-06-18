//Solution 1 use bucket to store the last position of the digits
class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        
        int[] buckets = new int[10];
        for (int i = 0; i < digits.length; i++) {
            buckets[digits[i] - '0'] = i;//key point
        }
        int max = 9;
        for (int i = 0; i < digits.length; i++) {
            for (int k = max; k > digits[i] - '0'; k--) {
                if (buckets[k] > i) { //key point
                    char tmp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = tmp;
                    return Integer.valueOf(new String(digits));
                }
            }
            max = digits[i] - '0';//key point
        }
        
        return num;
    }
}