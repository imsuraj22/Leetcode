class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        
        reverse(0,n-k-1,nums);
        reverse(n-k,n-1,nums);
        reverse(0,n-1,nums);
        
    }
    void reverse(int low, int high, int arr[]){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}