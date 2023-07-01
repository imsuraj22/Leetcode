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
        List<List<Integer>> list=new ArrayList<>();
    Queue<Pair> q=new LinkedList<>();
    q.add(new Pair(root, 1));
        if(root==null) return list;
    while(!q.isEmpty()){
        int size=q.size();
        int l=0;
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<size;i++){
            Pair curr=q.poll();
            l=curr.level;
            temp.add(curr.root.val);
            if(curr.root.left!=null) q.add(new Pair(curr.root.left, l+1));
            if(curr.root.right!=null) q.add(new Pair(curr.root.right, l+1));


        }
        if(l%2==0) Collections.reverse(temp);
        list.add(temp);
    }

    return list;
    }
}