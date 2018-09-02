//Solution 1 Union Find solution
//the code loops through the edges sequentially, 
//and if adding an edge forms a loop then it is the last edge inside that loop,
//which is indeed what we want to return
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[1001];
        for (int i = 0; i < parent.length; i++) parent[i] = i;
        
        for (int[] edge: edges){
            int f = edge[0], t = edge[1];
            if (find(parent, f) == find(parent, t)) return edge;
            else parent[find(parent, f)] = find(parent, t);
        }
        
        return new int[2];
    }
    
    private int find(int[] parent, int f) {
        if (f != parent[f]) {
          parent[f] = find(parent, parent[f]);  
        }
        return parent[f];
    }
}