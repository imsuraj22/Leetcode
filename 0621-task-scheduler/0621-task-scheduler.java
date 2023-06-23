class Solution {
     public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char t:tasks){
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>(map.size(), Collections.reverseOrder());

        q.addAll(map.values());

        int result=0;
        while(!q.isEmpty()){
            int time=0;
            List<Integer> list=new ArrayList<>(n+1);
            for(int i=0;i<n+1;i++){
                if(!q.isEmpty()){
                    list.add(q.remove()-1);
                    time++;
                }
            }
            for(int l:list){
                if(l>0) q.add(l);
            }

            result+=q.isEmpty()?time:n+1;
        }

        return result;
    }

}