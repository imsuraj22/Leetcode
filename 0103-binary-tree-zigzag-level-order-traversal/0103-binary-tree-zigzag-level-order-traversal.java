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
        int level;
        Pair(TreeNode root, int level){
            this.root=root;
            this.level=level;
        }
     }
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<>();
        if(root==null) return result;
        Queue<Pair> q=new LinkedList<>();

        int level=0;
        q.add(new Pair(root, level+1));

        while(!q.isEmpty()){

            int size=q.size();
            List<Integer> temp=new ArrayList<>();
            int l=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.peek().root;
                l=q.peek().level;
                q.poll();
                temp.add(curr.val);
                if(curr.left!=null) q.add(new Pair(curr.left, l+1));
                if(curr.right!=null) q.add(new Pair(curr.right, l+1));


            }
            if(l%2==0){
                Collections.reverse(temp);
            }
            result.add(temp);

        }
        return result;
    }
}