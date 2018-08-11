//Solution 1 consice dfs solution
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        
		//This graph might be a disconnected graph. So check each unvisited node.		
        for (int i = 0; i < n; i++) {              
            if (colors[i] == -1 && !validColor(graph, colors, 0, i)) {//validColor function executes every loop
                return false;
            }
        }
        return true;
    }
    
    public boolean validColor(int[][] graph, int[] colors, int color, int node) {
        if (colors[node] != -1) {
            return colors[node] == color;
        }       
        colors[node] = color;       
        for (int next : graph[node]) {
            if (!validColor(graph, colors, 1 - color, next)) {validColor function executes every loop
                return false;
            }
        }
        return true;
    }
}