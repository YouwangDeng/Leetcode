//Solution 1 use bottom-up sum and char setCharAt method
class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        StringBuilder res = new StringBuilder(S);
        for (int i = shifts.length - 2; i >= 0; i--) shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        for (int i = 0; i < S.length(); i++) res.setCharAt(i, (char)((S.charAt(i) - 'a' + shifts[i]) % 26 + 'a'));
        return res.toString();
    }
}