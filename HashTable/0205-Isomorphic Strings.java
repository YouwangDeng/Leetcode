//Solution 1 use HashMap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i); 
            if (map.containsKey(a)) {
                if (map.get(a) != b)
                    return false;
            }
            else if (!map.containsValue(b))
                map.put(a, b);
            else
                return false;
            
        }
        
        return true;
    }
}
//Solution 2 use two arrays
class Solution {
    public boolean isIsomorphic (String s, String t) {
        int[] m1 = new int[256];//ASCII
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}