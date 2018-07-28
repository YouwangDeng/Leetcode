//Solution 1 use LinkedList and consice backtracking solution
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>>ret = new ArrayList<List<Integer>>(); 
        List<Integer> cur = new ArrayList<Integer>(); 
        pathSum(root, sum, cur, ret);
        return ret;
    }

    public void pathSum(TreeNode root, int sum, List<Integer>cur, List<List<Integer>>ret){
        if (root == null){
            return; 
        }
        cur.add(root.val);
        if (root.left == null && root.right == null && root.val == sum){
            ret.add(new ArrayList(cur));
        }else{
            pathSum(root.left, sum - root.val, cur, ret);
            pathSum(root.right, sum - root.val, cur, ret);
        }
        cur.remove(cur.size()-1);
    }
}
