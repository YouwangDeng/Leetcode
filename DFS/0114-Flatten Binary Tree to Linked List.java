//Solution 1 use DFS and append TreeNode
public class Solution {
    public void flatten(TreeNode root) {
        flatten(root,null);
    }
    // 'append' records the head of following list that this tree needs to append
    private void flatten(TreeNode root, TreeNode append) {
        if(root==null) return;
        flatten(root.right, append);
        if (root.right == null) root.right = append;
        flatten(root.left, root.right);
        if (root.left != null) root.right = root.left;
        root.left = null;
    }
}