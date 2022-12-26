class Solution {
    static public boolean canJump(int[] nums) {
        int n=nums.length-1;
        int pos=n;
        
        for(int i=n-1;i>=0;i--){
            if(i+nums[i]>=pos){
                pos=i;
            }
        }
        return pos==0;
    }
    
}