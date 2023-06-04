class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int vis[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i, adj, vis);   
                count++;
            }
        }
        return count;
    }

    void dfs(int i,ArrayList<ArrayList<Integer>> adj, int vis[] ){
        vis[i]=1;
        for(Integer it:adj.get(i)){
            if(vis[it]==0){
                dfs(it, adj, vis);
            }
        }
    }
}