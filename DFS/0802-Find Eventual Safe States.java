//Solution 1 use graph coloring idea to do dfs solution
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        if(graph == null || graph.length == 0)  return res;
        
        int n = graph.length;
        int[] color = new int[n];
        
        for(int i = 0;i < n; i++){
            if(dfs(graph, i, color))    res.add(i);
        }
        
        return res;
    }
    public boolean dfs(int[][] graph, int start, int[] color){
        if(color[start] != 0)   return color[start] == 1;
        
        color[start] = 2;
        for(int newNode : graph[start]){
            if(!dfs(graph, newNode, color))    return false;
        }
        color[start] = 1;
        
        return true;
    }
}
