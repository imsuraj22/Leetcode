class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        
        int high=nums.length-1;
        if(nums.length<2) return 0;

        while(low<high){
            int mid=(low+high)/2;
            // if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
            //     return mid;
            // }else 
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}