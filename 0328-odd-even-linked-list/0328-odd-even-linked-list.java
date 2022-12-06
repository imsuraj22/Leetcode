/**
 * Definition for singly-linked list.
 * 
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
         if(head == null) return head;
        ListNode odd = head, even = head.next;
        ListNode evenHead = even;
        
        while(odd.next != null && even.next != null){
            odd.next = even.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
} 