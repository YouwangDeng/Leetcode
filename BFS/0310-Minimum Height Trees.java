//Solution 1 remove leaves BFS solution
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> leaves = new ArrayList<>();

        if (n == 0) return leaves;
        else if (n == 1) { leaves.add(0); return leaves;}

        List<Integer>[] lists = new ArrayList[n];
        for (int i = 0; i < n; i++) lists[i] = new ArrayList<>();

        for (int[] e : edges) {
            int v1 = e[0], v2 = e[1];
            lists[v1].add(v2);
            lists[v2].add(v1);
        }

        for (int i = 0; i < n; i++) if (lists[i].size() == 1) leaves.add(i);

        int count = n;
        while (count > 2) {
            count -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (Integer leaf : leaves) { // for all current leaves
                for (Integer toRemove : lists[leaf]) { // for all current leaves' subtree
                    lists[toRemove].remove(Integer.valueOf(leaf)); // remove leaf
                    if (lists[toRemove].size() == 1) newLeaves.add(toRemove);
                }
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}