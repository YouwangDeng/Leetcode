//Solution 1 recursive and stack solution i++ is key point
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Codec {

   // Encodes a tree to a single string.
    public String serialize(Node root) {
	    return serialize(root,new StringBuilder());        
    }
    
    String serialize(Node root, StringBuilder sb) {
        
        if(root==null) return "";
        else {
            sb.append(root.val+"[");
            for(Node child:root.children) serialize(child,sb);
            sb.append("]");
        }	
        
        return sb.toString();
    }
    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
        
        int i=0, len=data.length();
        Node root=null;
        Stack<Node> stack = new Stack<>();
        
        while(i<len) {
            int start=i;
            while(i<len && Character.isDigit(data.charAt(i))) i++;
            if(start==i) {
                Node child = stack.pop();
                if(stack.isEmpty()) {root=child; break;}
                stack.peek().children.add(child);
            } else stack.push(new Node(Integer.parseInt(data.substring(start,i)),new ArrayList<Node>()));
            //key point i increment
            i++;		
        }	
        
        return root;		
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));