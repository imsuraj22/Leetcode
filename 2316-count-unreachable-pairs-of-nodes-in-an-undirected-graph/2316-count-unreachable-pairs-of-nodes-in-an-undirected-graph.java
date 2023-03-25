class Solution {
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
  public long countPairs(int n, int[][] edges) {
        //int count=0;
        
        for(int i=0;i<n;i++){
          adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
          adj.get(edges[i][0]).add(edges[i][1]);
          adj.get(edges[i][1]).add(edges[i][0]);
        }
        long res=0,sum=n;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
          if(!visited[i]){
            int curr=dfs(i,visited, new int[1]);
            sum=sum-curr;
            res+=sum*curr;
          }
        }
        return res;

  }

  int dfs(int node, boolean visited[], int[] count){
    if(visited[node])return count[0];
    visited[node]=true;
    count[0]++;

    for(int curr:adj.get(node)){
      dfs(curr, visited, count);
    }
    return count[0];
  }
}