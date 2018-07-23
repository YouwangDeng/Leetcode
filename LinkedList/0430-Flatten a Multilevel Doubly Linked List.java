//Solution 1 recursive predummy solution
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        return helper(head, new Node());
    }
    
    public Node helper(Node head, Node prevDummy) {
        Node cur = head;
        while (cur != null) {
          if (cur.child != null) {
            Node next = cur.next;
            cur.child.prev = cur;
            cur.next = helper(cur.child, prevDummy);
            cur.child = null;
            if (next != null) {
              Node prev = prevDummy.next;
              prev.next = next;
              next.prev = prev;
            }
          }

          prevDummy.next = cur;
          cur = cur.next;
        }

        return head;
    }
}