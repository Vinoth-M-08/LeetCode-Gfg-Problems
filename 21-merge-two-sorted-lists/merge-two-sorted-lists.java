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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode temp=head;
        ArrayList<Integer>list_1=new ArrayList<>();
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null){
            list_1.add(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            list_1.add(temp2.val);
            temp2=temp2.next;
        }
        Collections.sort(list_1);
        int i=0;
        while(i<list_1.size()){
            temp.next=new ListNode(list_1.get(i));
            temp=temp.next;
            i++;
        }
        return head.next;
    }
}