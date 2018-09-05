//Solution 1 find the leftmost maker and turn the right digits of it to be 9
class Solution {
    public int monotoneIncreasingDigits(int N) {

        char[] chars=Integer.toString(N).toCharArray();

        int marker=chars.length;
        for (int i=chars.length-1;i>0;i--){
            if (chars[i]-'0'<chars[i-1]-'0'){
                marker=i;
                chars[i - 1] -= 1;
            }
        }
        for (int i=marker;i<chars.length;i++){
            chars[i]='9';
        }
        return Integer.valueOf(new String(chars));
    }
}