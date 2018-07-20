//Solution 1 fibonacci binary DP solution
public class Solution {
    public int findIntegers(int num) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num)).reverse();
        int n = sb.length();
        
        int a[] = new int[n];
        int b[] = new int[n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + b[i - 1];//i+1 length valid binary string end with 0
            b[i] = a[i - 1];//i+1 length valid binary string end with 1
        }
        
        int result = a[n - 1] + b[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (sb.charAt(i) == '1' && sb.charAt(i + 1) == '1') break;// all valid binary strings formed before are valid because 11 would not appear in above strings 
            if (sb.charAt(i) == '0' && sb.charAt(i + 1) == '0') result -= b[i];//remove formed strings that are larger that num
        }
        
        return result;
    }
}