//Solution 1 use HashMap to store every subtree
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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new LinkedList<>();
        postorder(root, new HashMap<>(), res);
        return res;
    }

    public String postorder(TreeNode cur, Map<String, Integer> map, List<TreeNode> res) {
        if (cur == null) return "#";  
        StringBuilder sb = new StringBuilder();
        sb.append(cur.val).append(",");
        sb.append(postorder(cur.left, map, res)).append(",");
        sb.append(postorder(cur.right, map, res));
        
        String serial = sb.toString();
        
        if (map.getOrDefault(serial, 0) == 1) 
            res.add(cur);
        
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        return serial;
    }
}