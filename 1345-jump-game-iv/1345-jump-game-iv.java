class Solution {
    public int minJumps(int[] arr) {
         int n=arr.length;

       HashMap<Integer,ArrayList<Integer>>map =new HashMap<>();
       for(int i=0;i<arr.length;i++){
        map.computeIfAbsent(arr[i], l->new ArrayList()).add(i); 
       }

       Queue<Integer> q=new LinkedList<>();
       HashSet<Integer> visited=new HashSet<>();
       q.add(0);
       visited.add(0);
       int steps=0;

       while(!q.isEmpty()){
        int size=q.size();
        while(size-- > 0){
          int i=q.poll();
          if(n-1 == i) return steps;
          ArrayList<Integer> list=map.get(arr[i]);
          list.add(i-1);
          list.add(i+1);
          for(int j:list){
            if(j>=0 && j<n && !visited.contains(j)){
              q.add(j);
              visited.add(j);
            }
          }
          list.clear();
        }
        steps++;

       }
       return -1;
    }
}