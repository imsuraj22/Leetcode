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
    public TreeNode invertTree(TreeNode root) {
              if(root==null){
            return root;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    void solution(TreeNode root){
         if(root.left!=null){
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        solution(root.left);
       }
       if(root.right!=null){
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;

        solution(root.right);
       }

    }
}