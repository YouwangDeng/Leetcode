//Solution 1 recursion solution
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
    public int closestValue(TreeNode root, double target) {
        int a = root.val;
        TreeNode kid = target < a ? root.left : root.right;
        if (kid == null) return a;
        int b = closestValue(kid, target);
        return Math.abs(a - target) < Math.abs(b - target) ? a : b;
    }
}
//Solution 2 clear iteration solution
class Solution {
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        while (root != null) {
            if (Math.abs(closest - target) >= Math.abs(root.val - target))
                closest = root.val;
            root = target < root.val ? root.left : root.right;
        }
        return closest;
    }
}