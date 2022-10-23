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
    public List<Integer> preorderTraversal(TreeNode root) {
         Stack<TreeNode>  stack=new Stack();
        List<Integer> list=new ArrayList();
        
        if(root==null){
            return list;
        }
        
        TreeNode current=root;
        while(current!=null ||!stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                list.add(current.val);
                current=current.left;
            }
            current=stack.pop();
            
            current=current.right;
        }
        return list;
        
        
    }
}