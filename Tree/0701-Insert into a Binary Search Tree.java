//Solution 1 insert to leaf solution
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
    
    private TreeNode insertIntoBSTUtil(TreeNode root, int val, TreeNode node) {
        if(root==null) 
            return node;
        if(root.val > val)
            root.left=insertIntoBSTUtil(root.left,val,node);
        else
            root.right=insertIntoBSTUtil(root.right,val,node);
        return root;
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertIntoBSTUtil(root,val,new TreeNode(val));
    }
    
}