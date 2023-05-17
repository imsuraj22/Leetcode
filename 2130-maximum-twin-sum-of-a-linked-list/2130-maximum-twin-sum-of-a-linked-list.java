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
    public int pairSum(ListNode head) {
    int max=0;
       if(head==null) return 0;
       if(head.next==null) return head.val;
       ListNode fast=head;
       ListNode slow=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       slow=reverse(slow);
       fast=head;
       while(slow!=null){
        max=Math.max(fast.val+slow.val, max);
        slow=slow.next;
        fast=fast.next;
       }

       return max; 

    }

    ListNode reverse(ListNode node){
      ListNode current=node;
      ListNode prev=null;
      while(current!=null){
        ListNode next=current.next;
        current.next=prev;
        prev=current;
        current=next;

      }

      return prev;
    }

}