/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
   public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    List<Integer> list=new ArrayList<>();
    HashMap<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        HashMap<TreeNode,Boolean> visited=new HashMap<>();
        if(root==null) return list;

        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                    map.put(curr.left, curr);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                    map.put(curr.right, curr);
                }
            }
        }
        q.add(target);
        visited.put(target, true);
        int currLevel=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(currLevel==k) break;
            currLevel++;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && visited.get(curr.left)==null){
                    q.add(curr.left);
                    visited.put(curr.left, true);
                }
                if(curr.right!=null && visited.get(curr.right)==null){
                    q.add(curr.right);
                    visited.put(curr.right, true);
                }
                if(map.get(curr)!=null && visited.get(map.get(curr))==null){
                    q.add(map.get(curr));
                    visited.put(map.get(curr), true);
                }
            }
        }
        while(!q.isEmpty()){
            list.add(q.poll().val);
        }

        return list;
  }
}