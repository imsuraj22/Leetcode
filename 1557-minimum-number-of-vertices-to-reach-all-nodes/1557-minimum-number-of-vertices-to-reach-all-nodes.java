class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
   
     int arr[]=new int[n];
    ArrayList<Integer> list=new ArrayList<>();
    for(List<Integer> e:edges){
      arr[e.get(1)]=1;

    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]==0) list.add(i);
    }

    return list;

  }

  
}