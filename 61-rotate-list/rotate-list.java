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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(head==null){
            return null;
        }
        int r=1;
        while(temp.next!=null){
            r++;
            temp=temp.next;
        }
        k=k%r;
        temp.next=head;
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<r-k-1;i++){
            slow=slow.next;
        }
        fast=slow.next;
        head=fast;
        slow.next=null;
        return head;
    }
}