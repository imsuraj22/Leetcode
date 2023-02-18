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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null) return root;

        Queue<TreeNode> q=new LinkedList<>();
        int level=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();

            level++;
            TreeNode nodes[]=new TreeNode[size];
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                nodes[i]=curr;
                if(curr.left!=null){
                    q.add(curr.left);
                    q.add(curr.right);
                }
            }

            if(level%2==0){
                int left=0;
                int right=size-1;
                while(left<right){
                    int leftVal=nodes[left].val;
                    nodes[left].val=nodes[right].val;
                    nodes[right].val=leftVal;

                    left++;
                    right--;
                }

            }
        }
        return root;
        
    }
}