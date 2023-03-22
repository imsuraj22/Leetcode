class Solution {
   public int minScore(int n, int[][] roads) {
        HashMap<Integer, List<List<Integer>>> adj=new HashMap<>();

        for(int road[]:roads){
          adj.computeIfAbsent(road[0], l->new ArrayList<List<Integer>>()).add(Arrays.asList(road[1],road[2]));
          adj.computeIfAbsent(road[1], l->new ArrayList<List<Integer>>()).add(Arrays.asList(road[0],road[2]));
        }
        return bfs(adj,n);
    }
    int bfs(HashMap<Integer, List<List<Integer>>> map, int n){
      boolean visited[]=new boolean[n+1];
      Queue<Integer> q=new LinkedList<>();
      int answer=Integer.MAX_VALUE;

      q.offer(1);
      visited[1]=true;

      while(!q.isEmpty()){
        int node=q.poll();
        if(!map.containsKey(node)){
          continue;
        }
        for(List<Integer> edge:map.get(node)){
          answer=Math.min(answer, edge.get(1));
          if(!visited[edge.get(0)]){
            visited[edge.get(0)]=true;
            q.offer(edge.get(0));
          }
        }
      }

      return answer;
    }

}