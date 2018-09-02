//Solution 1 recursive solution
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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)  return -1;
        return findSecondMinValue(root, root.val);
    }


    public int findSecondMinValue(TreeNode root, int min) {
        if(root==null)  return -1;
        //key point
        if(root.val>min)   return root.val;
        int leftMin = findSecondMinValue(root.left,min);
        int rightMin = findSecondMinValue(root.right,min);
        return (leftMin==-1 || rightMin==-1) ? Math.max(leftMin,rightMin) : Math.min(leftMin,rightMin);
    }
}