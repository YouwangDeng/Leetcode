//Solution 1 use Set need clear thought
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for (int i : G) {
            set.add(i);
        }
        int count = 0;
        while (head != null) {
            boolean found = false;
            while (head!= null && set.contains(head.val)) {
                found = true;
                head= head.next;
            }
            if (found) {
                count++;
            }
            if (head != null) {
                head = head.next;
            }
        }
        return count;
    }
}
//Solution 2 shorter solution
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> setG = new HashSet<>();
        for (int i: G) setG.add(i);
        int res = 0;
        while (head != null) {
            if (setG.contains(head.val) && (head.next == null || !setG.contains(head.next.val))) res++;
            head = head.next;
        }
        return res;
    }
}