//Solution 1 use indexOf method and decrement from the back to front
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0) pre = pre.substring(0,pre.length()-1);
        return pre;
    }
}