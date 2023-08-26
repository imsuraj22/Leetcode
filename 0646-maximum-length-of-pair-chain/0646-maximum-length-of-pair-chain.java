class Solution {
    public int findLongestChain(int[][] pairs) {
         PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        for(int i=0;i<pairs.length;i++){
            q.add(pairs[i]);
        }
        int length=0;
        int curr[]=new int[2];
        if(q.size()>0){
            curr=q.poll();
            length++;
        }
        while(!q.isEmpty()){
             int c[]=q.poll();
             if(curr[1]<c[0]){
                length++;
                 curr=c;
             }
             

        }
        return length;
    }
}