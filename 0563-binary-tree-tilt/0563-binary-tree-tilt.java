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
    int sum=0;
    public int findTilt(TreeNode root) {
        //int sum=0;
        solution(root);
        return sum;

    }

    int solution( TreeNode root){
        if(root==null) return 0;
        int left=solution( root.left);
        int right=solution(root.right);
        int s=Math.abs(left-right);
        this.sum+=s;

        return root.val+left+right;
    }
}