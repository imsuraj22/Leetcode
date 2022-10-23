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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       
        List<List<Integer>> result=new ArrayList<>();
         if(root==null) return result;
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> nodes=new ArrayList();
            int size=q.size();
           
            for(int i=0;i<size;i++){
                 TreeNode node=q.poll();
                nodes.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            result.add(0,nodes);
        }
         return result;
    }
   
}