class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[n];
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<graph.length;i++){
           for(Integer it:graph[i]){
            adj.get(it).add(i);
            indegree[i]++;
        }  
        }
        

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0) {
                q.add(i);
                //System.out.println(i);
            }
        }

        
        while(!q.isEmpty()){
            int Node=q.poll();
            list.add(Node);
            for(Integer it:adj.get(Node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }

        }
         Collections.sort(list);
         return list;
    }
}