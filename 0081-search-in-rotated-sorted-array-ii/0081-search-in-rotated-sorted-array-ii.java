class Solution {
    public boolean search(int[] nums, int target) {
         int low=0;
        int high=nums.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(target==nums[mid]){
                return true;
            }

            else if(nums[low]<=nums[mid]){

                if(target<=nums[mid] && target>=nums[low]){
                    high=mid-1;
                }else{
                    low=low+1;
                }

            }else{
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=high-1;
                }


            }
        }
        return false;
    }
}