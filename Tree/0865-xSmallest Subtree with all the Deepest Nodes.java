//Solution 1 use HashMap and DFS solution
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
       if( root == null ) return null;
       HashMap<TreeNode,Integer> map = new HashMap<>();
       depth(root,map);
       return dfs(root,map);
   }
    
    public int depth(TreeNode root,HashMap<TreeNode,Integer> map){
        if(root == null ) return 0;
        if( map.containsKey(root) ) return map.get(root); 
        int max = Math.max(depth(root.left,map),depth(root.right,map))+1;
        map.put(root,max);   
        return max;
   }
    
   public TreeNode dfs(TreeNode root, HashMap<TreeNode,Integer> map){
       int left =  root.left == null ?  0 : map.get(root.left);
       int right = root.right == null ?  0 : map.get(root.right);
       if( left  == right ) return root;
       if( left > right ) return dfs(root.left,map);
       return dfs(root.right,map);
   }
   
}