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
 class Pair{
        TreeNode root;
        int second;
        Pair(TreeNode root, int second){
            this.root=root;
            this.second=second;
        }
     }  
class Solution {
    Integer res; 
    Integer prev=0;
        
    public int minDiffInBST(TreeNode root) {
        res = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return res;
    }
    
    public void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        if(prev !=  null){
            res = Math.min(res, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
   
}