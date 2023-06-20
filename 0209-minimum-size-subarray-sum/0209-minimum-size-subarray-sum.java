class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==1){
        if(nums[0]==target) return 1;
        else return 0;
    }
    int ans=Integer.MAX_VALUE;
    int sum=0;
    int i=0,j=0;
    while(j<nums.length){
        sum+=nums[j];
        if(sum>=target){
            while(sum>=target){
                sum-=nums[i];
                i++;
            }
            ans=Math.min(ans, j-i+2);
            //sum-=nums[i];
           // i++;
        }
        j++;
    }
    if(ans<=nums.length) return ans;
        return 0;
    }
}