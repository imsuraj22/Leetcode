class Solution {
    public double trimMean(int[] arr) {
 Arrays.sort(arr);

      ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
        list.add(arr[i]);
      }
      int totalElements = arr.length;
        double percentage = 0.05;
        int numElementsToSelect = (int) Math.ceil(totalElements * percentage);
        //int i=0;
        for(int i=0;i<numElementsToSelect;i++){
          list.remove(0);
        }
        for(int i=0;i<numElementsToSelect;i++){
          list.remove(list.size()-1);
        }
        double sum=0;
        for(int i=0;i<list.size();i++){
          sum+=list.get(i);
        }
        double d=sum/list.size();
        return d;
    }
}