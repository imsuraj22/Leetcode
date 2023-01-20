class Solution {
    HashSet<List<Integer>> set=new HashSet<>();
    int arr[];
    public List<List<Integer>> findSubsequences(int[] nums) {
        arr=nums;
        List<Integer> array=new ArrayList<>();
        recursion(array,0);

        List<List<Integer>> result=new ArrayList<>(set);
        return result;


    }

    void recursion(List<Integer> arraylist, int index)
    {
        if(arraylist.size()>=2) set.add(new ArrayList<>(arraylist));

        for(int i=index;i<arr.length;i++){
            if(arraylist.size()==0 || arr[i]>=arraylist.get(arraylist.size()-1)){
                arraylist.add(arr[i]);
                recursion(arraylist, i+1);
                arraylist.remove(arraylist.size()-1);
            }
        }
    }
}