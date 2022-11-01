class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
            int j=1;
            while(k>0){
                if(!set.contains(j)){
                    k--;
                }
                j++;
            }
        return j-1;
    }
}