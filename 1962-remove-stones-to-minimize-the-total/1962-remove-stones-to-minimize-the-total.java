class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<piles.length;i++){
            q.add(piles[i]);
        }
 
        while(k>0){
            
              int curr=q.poll();
                long ans=Math.round((double)curr/2);
                int i=(int)ans;
                q.add(i);
                k--;

        }

        int max=0;
        while(!q.isEmpty()){
            max+=q.poll();
        }

        return max;
    }
}