//Solution 1 nice usage of max, DFS and target value solution
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
    
    public int longestConsecutive(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return DFS(root, root.val + 1, 1, 1);
    }

    private int DFS(TreeNode node, int target, int curr, int max) {
        if (node == null) {
            return max;
        }
        if (node.val == target) {
            curr++;
            max = Math.max(max, curr);
        } else {
            curr = 1;
        }
        return Math.max(DFS(node.left, node.val + 1, curr, max), DFS(node.right, node.val + 1, curr, max));
    }
}