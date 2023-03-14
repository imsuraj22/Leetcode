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
   int finalSum=0;
  public int sumNumbers(TreeNode root) {
    StringBuilder sb=new StringBuilder();
         return solution(root,0);
  }

  int solution(TreeNode root, int sum){
   if(root==null){
      return 0;
    }
    int currSum=sum*10+root.val;
    if(root.left==null && root.right==null) return currSum;
    int left=solution(root.left, currSum);
    int right=solution(root.right, currSum);

    return left+right;


  }
}