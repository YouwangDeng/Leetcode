//Solution 1 use recursive left and right tranversal solution
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private int res;
    public int countUnivalSubtrees(TreeNode root) {
        res = 0;
        helper(root);
        return res;
    }
    private boolean helper(TreeNode node){
        if(node == null){
            return true;
        }
        boolean left = helper(node.left);
        boolean right = helper(node.right);
        if(left && right){//key point
            if ((node.left != null && node.val != node.left.val) ||//key point
                (node.right != null && node.val != node.right.val)){//key point
                    return false;
            }
            res++;//key point
            return true;
        }
        return false;
    }
}