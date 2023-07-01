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
    TreeNode node;
    int num;
    Pair(TreeNode node, int num){
        this.node=node;
        this.num=num;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();
        int ans=0;
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            int size=q.size();
            int min=q.peek().num;
            int fist=0, last=0;
            for(int i=0;i<size;i++){
                int curr_id=q.peek().num-min;
                TreeNode curr=q.peek().node;
                q.poll();

                if(i==0) fist=curr_id;
                if(i==size-1) last=curr_id;

                if(curr.left!=null){
                    q.add(new Pair(curr.left, curr_id*2+1));
                }
                if(curr.right!=null){
                    q.add(new Pair(curr.right, curr_id*2+2));
                }
            }
            ans=Math.max(ans, last-fist+1);
        }
        return ans;
    }
}