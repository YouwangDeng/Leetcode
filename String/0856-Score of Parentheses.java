//Solution 1 use flag layers
class Solution {
    public int scoreOfParentheses(String S) {
        int res = 0, layers = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') layers++; else layers--;
            if (S.charAt(i) == '(' && S.charAt(i + 1) == ')') res += 1 << (layers - 1);
        }
        return res;
    }
}