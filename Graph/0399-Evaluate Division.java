//Solution 1 use HashMap and DFS solution
class Solution { 
    public double[] calcEquation(String[][] eq, double[] vals, String[][] q) {
        Map<String, Map<String, Double>> m = new HashMap<>();
        for (int i = 0; i < vals.length; i++) {
            m.putIfAbsent(eq[i][0], new HashMap<>());
            m.putIfAbsent(eq[i][1], new HashMap<>());
            m.get(eq[i][0]).put(eq[i][1], vals[i]);
            m.get(eq[i][1]).put(eq[i][0], 1 / vals[i]);
        }
        double[] r = new double[q.length];
        for (int i = 0; i < q.length; i++)
            r[i] = dfs(q[i][0], q[i][1], 1, m, new HashSet<>());
        return r;
    }

    double dfs(String s, String t, double r, Map<String, Map<String, Double>> m, Set<String> seen) {
        //use seen to avoid infinite loop
        if (!m.containsKey(s) || !seen.add(s)) return -1;
        if (s.equals(t)) return r;
        Map<String, Double> next = m.get(s);
        for (String c : next.keySet()) {
            double result = dfs(c, t, r * next.get(c), m, seen);
            if (result != -1) return result;
        }
        return -1;
    }
}