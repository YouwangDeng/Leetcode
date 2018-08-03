//Solution 1 depth DFS solution
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res, 0);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res, int depth){
        if(root == null){
            return;
        }
       //expand list size
        if(depth == res.size()){
            res.add(root.val);
        }
        else{
        //or set value
            res.set(depth, Math.max(res.get(depth), root.val));
        }
        helper(root.left, res, depth+1);
        helper(root.right, res, depth+1);
    }
}