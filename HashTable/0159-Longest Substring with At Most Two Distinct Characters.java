//Solution 1 use HashMap
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s.length() < 1) return 0;
        HashMap<Character,Integer> index = new HashMap<Character,Integer>();
        int lo = 0;
        int hi = 0;
        int maxLength = 0;
        while(hi < s.length()) {
            if(index.size() <= 2) {
                char c = s.charAt(hi);
                index.put(c, hi);
                hi++;
            }
            if(index.size() > 2) {
                int leftMost = s.length();
                for(int i : index.values()) {
                    leftMost = Math.min(leftMost,i);
                }
                char c = s.charAt(leftMost);
                index.remove(c);
                lo = leftMost+1;
            }
            maxLength = Math.max(maxLength, hi-lo);
        }
        return maxLength;
    }
}
//Solution 2 use two pointers
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int left1 = -1;
        int left2 = -1;
        int len = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (left1 == -1 || s.charAt(i) == s.charAt(left1)) {
                left1 = i;
                len++;
                max = Math.max(max, len);
            }
            else if (left2 == -1 || s.charAt(i) == s.charAt(left2)) {
                left2 = i;
                len++;
                max = Math.max(max, len);
            }
            else {
                if (left1 < left2) { 
                    len = i - left1; 
                    left1 = i;
                }
                else {
                    len = i - left2;
                    left2 = i; 
                }
            }
        }
        return max;
    }
}