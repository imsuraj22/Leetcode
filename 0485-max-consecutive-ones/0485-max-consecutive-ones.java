class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int i=0, result=0;
        int k=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                k--;
            }
            while(k<0){
                if(nums[i]==0){
                    k++;
                }
                i++;
            }
            result=Math.max(result,j-i+1);
            }
        return result;
    }
}