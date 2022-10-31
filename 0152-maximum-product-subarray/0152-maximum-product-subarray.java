class Solution {
    public int maxProduct(int[] nums) {
         int max=0;
        if(nums.length==1){
            return nums[0];
        }
    
        for(int i=0;i<nums.length;i++){
            int current=1;
            for(int j=i;j<nums.length;j++){
                current*=nums[j];
                if(current>max){
                    max=current;
                }
            }
        }
        return max;
    }
}