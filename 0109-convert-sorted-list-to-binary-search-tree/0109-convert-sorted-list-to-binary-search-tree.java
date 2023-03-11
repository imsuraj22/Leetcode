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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {

    if(head==null) return null;
    ArrayList<Integer> list=new ArrayList<>();
    ListNode temp=head;
    while(temp!=null){
      list.add(temp.val);
      temp=temp.next;
    }

    return constructTree(list, 0, list.size()-1);
    
  }
  TreeNode constructTree(ArrayList<Integer> list,int left, int right){
    if(left>right) return null;

    int mid=(left+right)/2;
    TreeNode node=new TreeNode(list.get(mid));
    node.left=constructTree(list, left, mid-1);
    node.right=constructTree(list, mid+1, right);
  
    return node;
  }
}