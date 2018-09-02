//Solution 1 standard BST tranversal solution
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) {
            return root;
        }
        else {
            return val<root.val? searchBST(root.left,val) : searchBST(root.right,val);
        }
    }
}