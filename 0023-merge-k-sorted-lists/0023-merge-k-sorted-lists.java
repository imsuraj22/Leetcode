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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode list1=lists[0];
        //ListNode ans=null;
        for(int i=1;i<lists.length;i++){
          list1=mergeTwoLists(list1,lists[i]);
        }

        return list1;
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1==null) return list2;
    if(list2==null) return list1;
        
    if(list1.val<=list2.val){
      list1.next=mergeTwoLists(list1.next, list2);
      return list1;
    }
    else{
      list2.next=mergeTwoLists(list1, list2.next);
      return list2;
    }
  }
}