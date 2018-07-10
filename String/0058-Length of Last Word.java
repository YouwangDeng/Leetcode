//Solution 1 use two pointers
class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length(), lastLength=0;

        while(len > 0 && s.charAt(len-1)==' '){
            len--;
        }

        while(len > 0 && s.charAt(len-1)!=' '){
            lastLength++;
            len--;
        }

        return lastLength;
    }
}
//Solution 2 1-line solution
class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}