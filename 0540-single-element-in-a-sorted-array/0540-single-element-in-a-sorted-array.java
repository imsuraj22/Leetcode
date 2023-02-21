class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0,high=nums.length-1;
      while(start<high){
        int mid=(start+high)/2;
        if(mid%2==1) mid--;

        if(nums[mid]!=nums[mid+1]) high=mid;
        else start=mid+2;
      }

      return nums[start];
    }
}