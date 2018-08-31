//Solution 1 inorder prev node solution
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
    //cause it is a BST, we could use prev to indentify consective same values
    //use inorder to traverse BST from low value to high value
    private TreeNode prev;
    private int count = 0;
    private int maxCount = -1;
    
    public int[] findMode(TreeNode root) {
        List<Integer> modes = new ArrayList();
        prev = root;
        inorder(root, modes);
        int[] ret = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) ret[i] = modes.get(i);
        return ret;
    }
    
    public void inorder(TreeNode root, List<Integer> modes) {
        if (root == null) return;
        inorder(root.left, modes);
        count = prev.val == root.val ? count + 1 : 1;
        
        if (count == maxCount) {
            modes.add(root.val);
        } else if (count > maxCount) {
            modes.clear();
            modes.add(root.val);
            maxCount = count;
        }
        
        prev = root;
        inorder(root.right, modes);
    }
}