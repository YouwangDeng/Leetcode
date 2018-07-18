//Solution 1 boolean consecutive DP solution
public class Solution {
    public boolean wordBreak(String s, List<String> dict) {        
        boolean[] f = new boolean[s.length() + 1];    
        f[0] = true;
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){//key point
                    f[i] = true;
                    break;
                }
            }
        }      
        return f[s.length()];
    }
}