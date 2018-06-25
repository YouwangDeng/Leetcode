//Solution 1 use two stacks
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        
        return list.val == 0 ? list.next : list;
    }
}
//Solution 2 lastNotNine solution much faster
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = getLength(l1), len2 = getLength(l2);
        if(len1 < len2){ // swap l1 and l2 to make sure l1 is the longer one
            ListNode tmp = l1; l1 = l2; l2 = tmp;
        }
        int diff = Math.abs(len1-len2);

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode lastnot9node = dummy;

        while(diff > 0){
            // create new node
            tail.next = new ListNode(l1.val);

            // update lastnot9node
            if(l1.val != 9) lastnot9node = tail.next;

            // update tails
            tail = tail.next;
            l1 = l1.next;
            diff--;
        }

        while(l1 != null){
            int val = l1.val + l2.val;

            if(val >= 10){
                val -= 10;
                // update previous nodes
                lastnot9node.val++;
                lastnot9node = lastnot9node.next;
                while(lastnot9node != null){
                    lastnot9node.val = 0;
                    lastnot9node = lastnot9node.next;
                }
            }

            // create new node
            tail.next = new ListNode(val);

            // update lastnot9node
            if(val != 9) lastnot9node = tail.next;

            // update tails
            tail = tail.next;
            l1   = l1.next;
            l2   = l2.next;
        }

        if(dummy.val == 1) return dummy;
        return dummy.next;
    }

    private int getLength(ListNode node){
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }
}