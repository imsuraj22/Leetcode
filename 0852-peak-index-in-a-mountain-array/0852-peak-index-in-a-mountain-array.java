class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                i++;
            }else{
                return i;
            }
        }
        return -1;
    }
}