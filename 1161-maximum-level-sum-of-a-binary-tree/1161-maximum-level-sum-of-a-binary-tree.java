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
    public int maxLevelSum(TreeNode root) {
          Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        int max=Integer.MIN_VALUE;
        int flevel=0;
        while(!q.isEmpty()){
            int size=q.size();
            int curr=0;

            for(int i=0;i<size;i++){
                TreeNode c=q.poll();
                curr+=c.val;
                if(c.left!=null){
                    q.add(c.left);

                }
                if(c.right!=null){
                    q.add(c.right);
                }
            }
            level++;
            if(curr>max) {
                max=curr;
                flevel=level;
            }
        }
        return flevel;
    }
}