//Solution 1 use two pointers and toCharArray method
class Solution {
    public String findLongestWord(String s, List<String> d) {
       String res = "";
       for(String w: d){
         if(isSubsequence(w, s)){
           if(w.length() > res.length()) res = w; 
           if(w.length() == res.length() && w.compareTo(res) < 0) res = w;  
         }  
       }    
       return res;
    }
    
    boolean isSubsequence(String w, String s){
      char[] wc = w.toCharArray();
      char[] sc = s.toCharArray();
      int i = 0, j = 0;
      while(i < wc.length && j < sc.length){
        if(wc[i] == sc[j]) i++;
        j++;    
      }  
      return i == wc.length;  
    }
}