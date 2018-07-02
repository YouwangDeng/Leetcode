//Solution 1 use recursion and Set make good use of the last n-1 numbers
class Solution {
    public String crackSafe(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int total = (int) (Math.pow(k, n));
        for (int i = 0; i < n; i++) sb.append('0');

        Set<String> visited = new HashSet<>();
        visited.add(sb.toString());

        dfs(sb, total, visited, n, k);

        return sb.toString();
    }

    private boolean dfs(StringBuilder sb, int goal, Set<String> visited, int n, int k) {
        if (visited.size() == goal) return true;
        String prev = sb.substring(sb.length() - n + 1, sb.length());
        for (int i = 0; i < k; i++) {
            String next = prev + i;
            if (!visited.contains(next)) {
                visited.add(next);
                sb.append(i);
                if (dfs(sb, goal, visited, n, k)) return true;
                else {
                    visited.remove(next);
                    sb.delete(sb.length() - 1, sb.length());
                }
            }
        }
        return false;
    }

}