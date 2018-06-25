//Solution 1 use Recursion Merge Sort 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
          return head;

        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
        }

        prev.next = null;

        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
    }
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;

        while (l1 != null && l2 != null) {
          if (l1.val < l2.val) {
            p.next = l1;
            l1 = l1.next;
          } else {
            p.next = l2;
            l2 = l2.next;
          }
          p = p.next;
        }

        if (l1 != null)
          p.next = l1;

        if (l2 != null)
          p.next = l2;

        return l.next;
      }
}
//Solution 2 iteration merge sort constant space
class Solution {
        class ListNodePair{
            ListNode head;
            ListNode tail;
            ListNodePair(ListNode h, ListNode t){   head = h;   tail = t;   } 
        }
        public ListNode sortList(ListNode head) {
            if(head == null || head.next == null)   return head;
            int len = 0;
            for(ListNode runner = head; runner != null; runner = runner.next)   len++;
            int lenOfList = 1;              //length of sorted sublists: at first we start with 1
            while(lenOfList < len){         //if greater than len, we have the whole list sorted
                head = mergeLayer(head, lenOfList);
                lenOfList *= 2;             //each iterate double the length of sorted sublists
            }
            return head;
        }
        //merge every two sublists of length lenOfList, assuming each sublist is already sorted 
        private ListNode mergeLayer(ListNode head, int lenOfList){
            ListNode fakehead = new ListNode(0);
            ListNode merge_tail = fakehead;   //merge_pail points to the tail of merged part of this layer
            ListNode first;
            ListNode first_tail;
            ListNode second;
            ListNode second_tail;
            ListNodePair pair;
            while(head != null){
                first = head;
                first_tail = getListTail(first, lenOfList);
                second = first_tail.next;
                if(second == null){                     //we have only 1 sorted sublist, 
                    merge_tail.next = head;             //link the sorted part to the last sorted sublist
                    break;
                }
                second_tail = getListTail(second, lenOfList);
                head = second_tail.next;    //now we have get two suitable subllists, point head to the rest
                
                first_tail.next = null;
                second_tail.next = null;
                pair = merge(first, second);
                merge_tail.next = pair.head;  //link the old sorted part to the newly sorted part
                merge_tail = pair.tail;       //update the end of sorted part
            }
            return fakehead.next;
        }
        //get the tail of the list with head 'head' and length 'len' (or at most len)     
        private ListNode getListTail(ListNode head, int len){ 
            while(len > 1 && head.next != null){
                head = head.next;
                len --;
            }
            return head;
        }  
        //merge two sorted lists, return both the head and tail of the new list
        private ListNodePair merge(ListNode l1, ListNode l2){
            ListNode fakehead = new ListNode(0);
            ListNode tail = fakehead;
            while(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    tail.next = l1;
                    l1 = l1.next;
                }else{
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }
            tail.next = (l1 == null) ? l2 : l1;
            while(tail.next != null)    tail = tail.next;
            return new ListNodePair(fakehead.next, tail);
        }
    }