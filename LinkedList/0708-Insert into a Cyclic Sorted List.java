//Solution 1 linkedlist cycle loop solution
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }
};
*/
class Solution {
    public Node insert(Node head, int insertVal) {
     //   System.out.println("head="+head.val);
        Node node = new Node(insertVal);
        if(head == null) {
            node.next = node;
            return node;
        }
        
        Node slow = head, fast = head;
        while(fast != null && fast.next != null) {
            if(slow.val > slow.next.val) break;
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        Node smallest = slow.next;
        slow.next = null;
        Node cur = smallest, prev = null;
        while(cur != null && cur.val <= insertVal) {
            prev = cur;
            cur = cur.next;
        }
        if(prev == null || cur == null) {
            slow.next = node;
            node.next = smallest;
        } else {
            slow.next = smallest;
            prev.next = node;
            node.next = cur;
        }
        return head;
    }
}