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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode newNode=new ListNode(0);
        ListNode curr=newNode;
        int sum=0;
        while(temp!=null){
            if(temp.val==0 && sum!=0){
                newNode.next=new ListNode(sum);
                newNode=newNode.next;
                sum=0;
            }
            sum+=temp.val;
            temp=temp.next;
        }
        return curr.next;
    }
}