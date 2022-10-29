class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=(nums.length)/2;
        int posarr[]=new int[len];
        int negarr[]=new int[len];

        int l=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                posarr[l++]=nums[i];
            }else{
                negarr[m++]=nums[i];
            }
        }
        l=0;
        m=0;

        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                nums[i]=posarr[l++];
            }else{
                nums[i]=negarr[m++];
            }
        }
        return nums;
    }
}