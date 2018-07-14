//Solution 1 use boolean array
class Solution {
    public String boldWords(String[] words, String S) {
        if (words == null || words.length == 0) return "";
        
        boolean[] marked = new boolean[S.length()];
        for (String word : words) {
            markWords(S, word, marked);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (marked[i] && (i == 0 || !marked[i - 1])) {
                sb.append("<b>");
            }
            sb.append(S.charAt(i));
            if (marked[i] && (i == S.length() - 1 || !marked[i + 1])) {
                sb.append("</b>");
            }
        }
        return sb.toString();
    }
    
    void markWords(String S, String word, boolean[] marked) {
        for (int i = 0; i <= S.length() - word.length(); i++) {
            String substr = S.substring(i, i + word.length());
            if (substr.equals(word)) {
                for (int j = i; j < i + word.length(); j++) {
                    marked[j] = true;
                }
            }
        }
    }
}