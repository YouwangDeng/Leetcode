//Solution 1 use character array
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String input = licensePlate.toLowerCase();
        int[] map = new int[26];
        for (char c: input.toCharArray()) {
            if (c - 'a' < 0 || c - 'a' > 25) continue;
            map[c - 'a']++;
        }
        int match = 0, length = 0;
        String res = "";
        for (String word: words) {
            int[] cur = new int[26];
            for (char c: word.toCharArray()) {
                cur[c - 'a']++;
            }
            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (map[i] == 0 || cur[i] == 0) continue;
                if (cur[i] >= map[i]) {
                    count += map[i];
                } else {
                    count += cur[i];
                }
            }
            if (count > match) {
                match = count;
                res = word;
                length = word.length();
            } else if (count == match) {
                if (word.length() < length) {
                    res = word;
                    length = word.length();
                }
            }
        }
        return res;
    }
}