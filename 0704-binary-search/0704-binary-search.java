class Solution {
     public int search(int[] nums, int target) {
        return solution(nums,0,nums.length,target);
  }

  int solution (int arr[], int s, int e, int val){
    while(s<e){
      int mid=(s+e)/2;
      if(arr[mid]==val) return mid;
      if(arr[mid]>val){
        e=mid;
      }else{
        s=mid+1;
      }
    }
    return -1;
  }
}