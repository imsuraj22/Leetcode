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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(root, 0));
        ArrayList<Long> res=new ArrayList<>();
        int maxlevel=0;
        
        while(!q.isEmpty()){
          int size=q.size();
          int l=0;
            maxlevel++;
          long sum=0;
          for(int i=0;i<size;i++){
            Pair p=q.poll();
            l=p.level;
            //maxlevel=p.level;
            TreeNode curr=p.root;
            sum+=curr.val;
            if(curr.left!=null) q.add(new Pair(curr.left, l+1));
            if(curr.right!=null) q.add(new Pair(curr.right, l+1));

          }
          res.add(sum);


        }
        Collections.sort(res, Collections.reverseOrder());
        if(maxlevel<k) return -1;
        return res.get(k-1);
    }
}