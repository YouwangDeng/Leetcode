//Solution 1 use HashMap and backtracking solution
public class Solution {
  
    public boolean wordPatternMatch(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        return isMatch(str, 0, pattern, 0, map);
    }

    boolean isMatch(String str, int i, String pat, int j, Map<Character, String> map) {
        // base case
        if (i == str.length() && j == pat.length()) return true;
        if (i == str.length() || j == pat.length()) return false;

        // get current pattern character
        char c = pat.charAt(j);

        // if the pattern character exists
        if (map.containsKey(c)) {
            String s = map.get(c);

            // then check if we can use it to match str[i...i+s.length()]
            if (!str.startsWith(s, i)) {
                return false;
            }

            // if it can match, great, continue to match the rest
            return isMatch(str, i + s.length(), pat, j + 1, map);
        }

        // pattern character does not exist in the map
        for (int k = i; k < str.length(); k++) {
            String p = str.substring(i, k + 1);

            if (map.containsValue(p)) {
                continue;
            }

            // create or update it
            map.put(c, p);

            // continue to match the rest
            if (isMatch(str, k + 1, pat, j + 1, map)) {
                return true;
            }

            // backtracking
            map.remove(c);
        }

        // we've tried our best but still no luck
        return false;
    }
  
}