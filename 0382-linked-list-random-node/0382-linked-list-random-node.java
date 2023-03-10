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

   int count=0;
   HashMap<Integer,ListNode> map=new HashMap<>();

  public Solution(ListNode head) {
    
        ListNode temp=head;
        while(temp!=null){
          map.put(count++, temp);
         // count++;

          temp=temp.next;
        }
  }
  
  public int getRandom() {
    int min=1;
    //int max=count;
    Random random = new Random();
    int randomNumber = random.nextInt(count);
    ListNode temp=null;
    for(Integer key:map.keySet()){
      temp=map.get(randomNumber);
    }

    return temp.val;
  }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */