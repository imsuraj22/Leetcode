class Solution {
    public int minReorder(int n, int[][] connections) {
        HashSet<String> set=new HashSet<>();
  HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
  
  for(int [] c:connections){
    set.add(c[0]+","+c[1]);
    map.computeIfAbsent(c[0], l->new HashSet<>());
    map.computeIfAbsent(c[1], l->new HashSet<>());
    map.get(c[0]).add(c[1]);
    map.get(c[1]).add(c[0]);
  }

  Queue<Integer> q=new LinkedList<>();
  boolean visited[]=new boolean[n];
  q.add(0);
  int res=0;
  visited[0]=true;
  while(!q.isEmpty()){
    int c=q.poll();
    for(int next:map.getOrDefault(c, new HashSet<>())){
      if(visited[next]) continue;
      visited[next]=true;
      if(!set.contains(next+","+c)) res++;
      q.add(next);
    }
  }
  return res;
    }
}