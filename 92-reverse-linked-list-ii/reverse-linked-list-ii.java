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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==1){
            return helper(head,right-left+1);
        }
        ListNode curr=head;
        int k=1;
        while(k<left-1){
            curr=curr.next;
            k++;
        }
        ListNode temp=helper(curr.next,right-left+1);
        curr.next=temp;
        return head;
    }
    public ListNode helper(ListNode temp,int end){
        ListNode prev=null;
        ListNode curr=temp;
        ListNode next=null;
        while(end>0 && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            end--;
        }
        if(temp!=null){
            temp.next=curr;
        }
        return prev; 
    }
    
}