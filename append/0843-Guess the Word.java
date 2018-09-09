//Solution 1 use same match times and narrow the difference to secret
/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] wordlist, Master master) {
        
        List<String> candidates = new LinkedList<>();
        int rand = new Random().nextInt(wordlist.length);
        String word = wordlist[rand];
        
        int cntMatched = master.guess(word);
        if (cntMatched == word.length()) {
            return;
        }

        for (String temp : wordlist) {
            if (countSameChars(temp, word) == cntMatched) {
                candidates.add(temp);
            }
        }
              
        wordlist = candidates.toArray(new String[candidates.size()]);

        findSecretWord(wordlist, master);
    }
    
    private int countSameChars(String word, String target) {
        
        int cntSame = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target.charAt(i)) {
                cntSame++;
            }
        }                
        
        return cntSame;
    }
}