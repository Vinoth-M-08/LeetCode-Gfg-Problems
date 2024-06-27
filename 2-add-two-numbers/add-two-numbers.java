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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ans=new ListNode();
        ListNode temp_ans=ans;
        while(l1!=null || l2!=null || carry!=0){
            int temp=carry;
            if(l1!=null){
                temp+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                temp+=l2.val;
                l2=l2.next;
            }
            if(temp>9){
                temp=temp%10;
                carry=1;
            }else{
                carry=0;
            }
            temp_ans.next=new ListNode(temp);
            temp_ans=temp_ans.next;
        }
        return ans.next;
    }
}