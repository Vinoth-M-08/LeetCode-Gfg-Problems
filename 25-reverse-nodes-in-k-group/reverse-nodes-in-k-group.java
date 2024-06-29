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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode tt=head;
        while(tt!=null){
            list.add(tt.val);
            tt=tt.next;
        }
        for(int i=0;i<=list.size()-k;i+=k){
            reverse(i,i+k-1,list);
        }
        ListNode dum=new ListNode();
        ListNode temp=dum;
        System.out.print(list);
        for(int i:list){
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        return dum.next;
    }
    public static void reverse(int l,int r,ArrayList<Integer>list){
        while(l<r){
            int s=list.get(l);
            list.set(l,list.get(r));
            list.set(r,s);
            l++;
            r--;
        }
    }
}