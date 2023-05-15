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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null) return head;
        ListNode first=head;
    ListNode third=head;
    //ListNode temp=null;

    int count=1;
    while(first.next!=null && count<k){
     // temp=first;
      first=first.next;
        count++;
    }
    ListNode second=first;
    while(second.next!=null){
      second=second.next;
      third=third.next;
    }
    int temp=first.val;
    first.val=third.val;
    third.val=temp;

    return head;
    }
}