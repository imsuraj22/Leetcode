class Solution {
    private List<Integer>[] buildAdj(int[] parent){
        int n = parent.length;
        List<Integer>[] adj = new List[n];
        for(int i=0; i<n; i++) adj[i] = new ArrayList<>();
        for(int child=1; child<n; child++){
            adj[parent[child]].add(child);
        }
        return adj;
    }
    private int[] longestPath(int src, List<Integer>[] adj, char[] labels){
        int childCount = adj[src].size();
        if(childCount==0) return new int[]{1, 1};

        int globalMax = 0;

       
        int maxSubPath = 0;
        int curLabel = labels[src];
      
        int maxPath = 0;

        for(int c=0; c<childCount; c++){
            int child = adj[src].get(c);
            char childLabel = labels[child];

            int[] res = longestPath(child, adj, labels);
            
            int subPath = res[0];
            int subGlobalMax = res[1];

            if(curLabel != childLabel){
               
                maxPath = Math.max(maxPath, maxSubPath + subPath + 1);

                maxSubPath = Math.max(maxSubPath, subPath);
            }
                
           
            globalMax = Math.max(globalMax, subGlobalMax);
        }
      
        globalMax = Math.max(globalMax, maxPath);
        globalMax = Math.max(globalMax, maxSubPath+1);

        return new int[]{maxSubPath+1, globalMax};
    }
    private int longestPath(List<Integer>[] adj, char[] labels){
        return longestPath(0, adj, labels)[1];
    }
    public int longestPath(int[] parent, String s) {
        List<Integer>[] adj = buildAdj(parent);
        return longestPath(adj, s.toCharArray());
    }
}