//Solution 1 use memoization to reduce time complexity backtracking solution
class Solution {
    public boolean canWin(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        
        Map<String, Boolean> memo = new HashMap<>();
        StringBuilder sb = new StringBuilder(s);
        return dfs(sb, memo);
    }
    
    private boolean dfs(StringBuilder sb, Map<String, Boolean> memo) {
        if (memo.containsKey(sb.toString())) {
            return memo.get(sb.toString());
        }
        
        for (int i = 0; i < sb.length()-1; i++) {
            if (sb.charAt(i) == '+' && sb.charAt(i+1) == '+') {
                sb.setCharAt(i, '-');
                sb.setCharAt(i+1, '-');
                if (!dfs(sb, memo)) {
                    sb.setCharAt(i, '+');
                    sb.setCharAt(i+1, '+');
                    memo.put(sb.toString(), true);
                    return true;
                }
                sb.setCharAt(i, '+');
                sb.setCharAt(i+1, '+');
            }
        }
        memo.put(sb.toString(), false);
        return false;
    }
}