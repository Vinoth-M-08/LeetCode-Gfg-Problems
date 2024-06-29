/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode new_head=Reverse(slow);
        while(new_head!=null && head!=null){
            if(head.val!=new_head.val) return false;
            head=head.next;
            new_head=new_head.next;
        }
        return true;
    }
    public ListNode Reverse(ListNode Head){
          ListNode prev = null;
            while (Head != null) {
                ListNode next = Head.next;
                Head.next = prev;
                prev = Head;
                Head = next;
            }
        return prev;
    }
}