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
        Deque<ListNode> q=new LinkedList<>();
        while(head!=null){
          q.add(head);
          head=head.next;
        }
        while(q.size()>1){
          int f=q.pollFirst().val;
            System.out.println("f "+f);
          int l=q.pollLast().val;
            System.out.println("l "+l);
          int curr=f+l;
          if(curr>max) max=curr;
        }
        return max;
    }
}