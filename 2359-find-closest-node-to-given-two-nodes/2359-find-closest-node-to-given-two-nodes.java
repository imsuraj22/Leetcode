class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n=edges.length;
        
        int dist1[]=new int[n];
        int dist2[]=new int[n];
        Arrays.fill(dist1,-1);
        Arrays.fill(dist2,-1);
        int d=1;
        
        while(node1!=-1){
            
            if(dist1[node1]!=-1){
                break;
            }
            
            dist1[node1]+=d;
            node1=edges[node1];
            d++;
        }
        
        d=1;
        
         while(node2!=-1){
            
            if(dist2[node2]!=-1){
                break;
            }
            
            dist2[node2]+=d;
            node2=edges[node2];
            d++;
        }
        
        int minD=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(dist1[i]!=-1 && dist2[i]!=-1){
                if(minD>Math.max(dist1[i],dist2[i])){
                    minD=Math.max(dist1[i],dist2[i]);
                    ans=i;
                }
            }
        }
        return ans;
    }
}