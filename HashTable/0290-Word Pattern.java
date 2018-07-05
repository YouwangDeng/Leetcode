//Solution 1 use HashMap
class Solution {
    boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;
        else {
            Map<Object, Integer> index = new HashMap<>(words.length);
            for (Integer i = 0; i < words.length; i++) {
                if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) return false;
            }
        }
        return true;
    }
}