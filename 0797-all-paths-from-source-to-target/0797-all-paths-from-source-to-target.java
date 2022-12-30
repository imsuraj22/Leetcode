class Solution {
     public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result=new ArrayList<>();
       List<Integer> path=new ArrayList<>();
       dfs(graph,result,path,0);
       return result; 
    }
    void dfs(int [][] graph, List<List<Integer>> result,List<Integer> path,int curr){
        path.add(curr);
        if(curr==graph.length-1){
            result.add(new ArrayList<>(path));
        }
        else{
            for(int nodes:graph[curr]){
                dfs(graph, result, path, nodes);
            }
        }
        path.remove(path.size()-1);
    }
}