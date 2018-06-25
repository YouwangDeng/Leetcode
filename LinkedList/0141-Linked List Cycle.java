//Solution 1 two pointers slow and fast
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}