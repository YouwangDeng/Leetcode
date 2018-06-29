//Solution 1 use StringBuilder and carry number
class Solution {
    public String addBinary(String a, String b) {
        int c = 0 , i = a.length() - 1 , j = b.length() - 1;
		String s = "";
		while (i >= 0 || j >= 0 || c == 1) {
			c += i >= 0 ? a.charAt(i--) - '0': 0;
			c += j >= 0 ? b.charAt(j--) - '0': 0;
			s += c % 2;
			c /= 2;
		}
        String res = new StringBuilder(s).reverse().toString();
		return res;
    }
}