/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode entry=head;
        if(head==null){
            return null;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                while(slow!=entry){
                    entry=entry.next;
                    slow=slow.next;
                }
                        return entry;
            }
        }
        return null;
    }
}