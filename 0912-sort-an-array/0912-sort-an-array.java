class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length -1);
        return nums;
    }
    void mergeSort(int arr[], int l, int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    
    void merge(int arr[], int l, int mid, int r){
        int sorted[]=new int[r-l+1];
        int k=0;
        int i=l;
        int j=mid+1;
        
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                sorted[k++]=arr[i++];
            }else{
                sorted[k++]=arr[j++];
            }
            
           
        }
         while(i<=mid){
                sorted[k++]=arr[i++];
            }
            while(j<=r){
                sorted[k++]=arr[j++];
            }
        System.arraycopy(sorted,0,arr,l,sorted.length);
    }
}