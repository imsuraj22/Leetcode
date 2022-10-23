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
    int total=0;
    public int sumRootToLeaf(TreeNode root) {
         
        sumBinary(root, 0);
        return total;
    }
    
    public void sumBinary(TreeNode root, int sum){
        if(root==null)  return;        
        sum = sum * 2 + root.val;
        if(root.left==null && root.right==null){   
            total += sum;
            return;
        }             
        sumBinary(root.left,sum);
        sumBinary(root.right,sum);
    }
}