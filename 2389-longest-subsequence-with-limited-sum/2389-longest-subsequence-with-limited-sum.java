class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
         int n=nums.length;
        int m=queries.length;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }

        int ans[]=new int[m];
        for(int i=0;i<m;i++){
            int q=queries[i];
            int low=0,high=n-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==q){
                    ans[i]=mid+1;
                    break;
                }else if(nums[mid]<q){
                    ans[i]=mid+1;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
    return ans;
    
    }
}