class Solution {
    public int findGCD(int[] nums) {
        int front = nums[0];
        int end = nums[0];
        for (int i = 0; i != nums.length; ++i) {
            if (front > nums[i]) front = nums[i];
            if (end < nums[i]) end = nums[i];
        }

        while(front!=end){
            if(front>end){
                front=front-end;
            }else{
                end=end-front;
            }
        }
        return front;
    }
}