class Solution {
    public int jump(int[] nums) {
        int currFast=0,currEnd=0,jump=0;
        
        for(int i=0;i<nums.length-1;i++){
            currFast=Math.max(currFast,i+nums[i]);
            if(i==currEnd){
                jump++;
                currEnd=currFast;
            }
            
        }
        return jump;
}
}