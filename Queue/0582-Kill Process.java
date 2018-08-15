//Solution 1 use HashMap and recursive tranversal
public class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        if (kill == 0) return pid;
        
        int n = pid.size();
        Map<Integer, Set<Integer>> tree = new HashMap<>();
        for (int i = 0; i < n; i++) {
            tree.put(pid.get(i), new HashSet<Integer>());
        }
        for (int i = 0; i < n; i++) {
            if (tree.containsKey(ppid.get(i))) {
                Set<Integer> children = tree.get(ppid.get(i));
                children.add(pid.get(i));
                tree.put(ppid.get(i), children);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        traverse(tree, result, kill);
        
        return result;
    }
    
    private void traverse(Map<Integer, Set<Integer>> tree, List<Integer> result, int pid) {
        result.add(pid);
        
        Set<Integer> children = tree.get(pid);
        for (Integer child : children) {
            traverse(tree, result, child);
        }
    }
}