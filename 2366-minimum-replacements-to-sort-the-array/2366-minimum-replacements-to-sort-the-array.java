class Solution {
    public long minimumReplacement(int[] nums) {
         long answer=0;
        int n=nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<=nums[i+1]){
                continue;
            }

            long numElements=(nums[i]+nums[i+1]-1)/nums[i+1];
            answer+=numElements-1;

            nums[i]=nums[i]/(int)numElements;
            System.out.println(nums[i]);



        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        return answer;
    }
}