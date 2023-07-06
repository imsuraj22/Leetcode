class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==1) {
            if(nums[0]==target){
            return 1;}
            return 0;
        }
         int i=0;
        //int j=1;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            
            while(i<nums.length && sum-nums[i]>=target){
                sum-=nums[i];
                i++;
            }
            if(sum>=target){
                ans=Math.min(ans, j-i+1);
            }
        }
        if(ans>nums.length) return 0;
        return ans;
    }
}