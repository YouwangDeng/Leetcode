//Solution 1 use global max DFS solution
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int max = 0;
    public int maxDepth(Node root) {
        if (root == null) return 0;
        dfs(root, 1);
        return max;
    }
    
    public void dfs(Node root, int depth) {
        if (root == null) return;
        max = Math.max(max, depth);
        for (Node node: root.children) {
            dfs(node, depth+1);
        }    
    }
}