//Solution 1 use two HashMap
class Solution {
    public String rearrangeString(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return s;
        }
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        HashMap<Character, Integer> valid = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!freq.containsKey(cur)) {
                freq.put(cur, 1);
                valid.put(cur, 0);
            } else {
                freq.put(cur, freq.get(cur) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char can = findValid(freq, valid, index);
            if (can == ' ') {
                return "";
            }
            sb.append(can);
            freq.put(can, freq.get(can) - 1);
            valid.put(can, index + k);
            index++;
        }
        return sb.toString();
    }
    private char findValid(HashMap<Character, Integer> freq, HashMap<Character, Integer> valid, int index) {
        int max = 0;
        char res = ' ';
        for (char item : freq.keySet()) {
            if (freq.get(item) > max && index >= valid.get(item)) {
                max = freq.get(item);
                res = item;
            }
        }
        return res;
    }
}