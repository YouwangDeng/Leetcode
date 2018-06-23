//Solution 1 use StringBuilder
class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        int ans = 0;
        List<StringBuilder>[] waiting = new List[128];
        for (int c = 0; c <= 'z'; c++)
            waiting[c] = new ArrayList();
        for (String w : words)
            waiting[w.charAt(0)].add(new StringBuilder(w));

        for (char c : S.toCharArray()) {
            List<StringBuilder> advance = waiting[c];

            waiting[c] = new ArrayList();

            for (StringBuilder it : advance){
                it.deleteCharAt(0);
                if(it.length() != 0)
                    waiting[it.charAt(0)].add(it);
                else
                    ans++;
            }
        }
        return ans;
    }
}