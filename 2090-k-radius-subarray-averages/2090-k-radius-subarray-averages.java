class Solution {
    public int[] getAverages(int[] nums, int k) {
        int res[]=new int[nums.length];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(i<k) res[i]=-1;
            sum+=nums[i];
            if(i>=2*k){
                res[i-k]=(int)(sum/(2*k+1));
                sum-=nums[i-2*k];
            }
            if(i>=nums.length-k) res[i]=-1;

        }
        return res;
    }
}