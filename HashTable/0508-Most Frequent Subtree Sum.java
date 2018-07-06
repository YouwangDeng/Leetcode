//Solution 1 use HashMap and Recursion elegant solution
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
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int fre = 0;
    List<Integer> res = new ArrayList<Integer>();
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null) return new int[0];

        helper(root);

        int[] ret = new int[res.size()];
        for(int i = 0; i < res.size(); i ++){
            ret[i] = res.get(i);
        }
        return ret;
    }
    public void helper(TreeNode root){
        if(root == null) return ;
        int sum = computeSum(root);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        if(map.get(sum) == fre){
            res.add(sum);
        }else if(map.get(sum) > fre){
            res.clear();
            res.add(sum);
        }
        fre = Math.max(fre, map.get(sum));

        helper(root.left);
        helper(root.right);
    }
    public int computeSum(TreeNode root){
        int s = root.val;
        if(root.left != null) s += computeSum(root.left);
        if(root.right != null) s += computeSum(root.right);
        return s;
    }
}