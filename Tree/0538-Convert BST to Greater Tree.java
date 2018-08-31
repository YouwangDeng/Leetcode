//Solution 1 inorder descending tranvesal
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
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);
        return root;
    }
    
    // sum   : all nodes which we have traversed thus far
    // return: root.val + sum of all nodes greater than root
    private int dfs(TreeNode root, int sum) {
        if (root == null) return sum;
        int rsum = dfs(root.right, sum);
        root.val += rsum;
        return dfs(root.left, root.val);
    }
}
//Solution much more clear solution but with a global value
public class Solution {

    int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    
    public void convert(TreeNode cur) {
        if (cur == null) return;
        convert(cur.right);
        cur.val += sum;
        sum = cur.val;
        convert(cur.left);
    }
    
}