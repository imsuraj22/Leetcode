class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int ans[]=new int[l];
        int i=0,j=n,k=0;
        while(i<j && j<l){
            ans[k++]=nums[i];
            ans[k++]=nums[j];
            i++;
            j++;
        }
        return ans;
    }
}