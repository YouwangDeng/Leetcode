//Solution 1 use compareTo method and StringBuilder and toString
public class Solution {
    public String splitLoopedString(String[] strs) {
        char max = 'a';
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                if (c > max) max = c;
            }
            String rev = new StringBuilder(strs[i]).reverse().toString();
            if (strs[i].compareTo(rev) < 0) strs[i] = rev;//key point
        }
        
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            String rev = new StringBuilder(strs[i]).reverse().toString();//key point
            for (String st: new String[] {strs[i], rev}) {
                for (int k = 0; k < st.length(); k++) {
                    if (st.charAt(k) != max) continue;
                    StringBuilder t = new StringBuilder(st.substring(k));
                    for (int j = i + 1; j < strs.length; j++)
                        t.append(strs[j]);
                    for (int j = 0; j < i; j++)
                        t.append(strs[j]);
                    t.append(st.substring(0, k));
                    if (t.toString().compareTo(res) > 0)
                        res = t.toString();
                }
            }
        }
        return res;
    }
}