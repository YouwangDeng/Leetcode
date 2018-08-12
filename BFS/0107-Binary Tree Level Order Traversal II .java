//Solution 1 use add(0,element) method
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();  
        if (root == null) return res;  
        Queue<TreeNode> queue = new LinkedList<>();  
        queue.add(root);
        
        while (!queue.isEmpty()) {  
            
            List<Integer> level = new ArrayList<>();  
            int cnt = queue.size();  
            
            for (int i = 0; i < cnt; i++) { 
                
                TreeNode node = queue.poll();  
                level.add(node.val);  
                
                if (node.left != null) {  
                  queue.add(node.left);  
                }
                
                if (node.right != null) {  
                  queue.add(node.right);  
                }
                
            }
            
            res.add(0,level);   
        }  
        return res;
    }
}