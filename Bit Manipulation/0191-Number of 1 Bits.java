//Solution 1 shift solution
public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int ones = 0;
            while(n!=0) {//key point
                ones = ones + (n & 1);
                n = n>>>1;
            }
            return ones;
    }
}