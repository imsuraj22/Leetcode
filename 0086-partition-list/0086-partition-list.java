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
    public ListNode partition(ListNode head, int x) {
        ListNode l1=new ListNode(0);
        ListNode l2=new ListNode(0);

        ListNode curr1=l1;
        ListNode curr2=l2;

        while(head!=null){
            if(head.val<x){
                curr1.next=head;
                curr1=head;
            }else{
                curr2.next=head;
                curr2=head;
            }
            head=head.next;
        }

        curr2.next=null;
        curr1.next=l2.next;
        return l1.next;
    }
}