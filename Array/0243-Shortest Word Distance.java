//Solution 1 O(n)
class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int p1 = -1, p2 = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) 
                p1 = i;

            if (words[i].equals(word2)) 
                p2 = i;

            if (p1 != -1 && p2 != -1)
                min = Math.min(min, Math.abs(p1 - p2));
        }

        return min;
    }
}
//Solution 2 keep 1 index much faster
class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int index = -1, minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
           if (words[i].equals(word1) || words[i].equals(word2)) {
              if (index != -1 && !words[index].equals(words[i])) {
                 minDistance = Math.min(minDistance, i - index);
              }
              index = i;
          }
        }
        return minDistance;
    }
}