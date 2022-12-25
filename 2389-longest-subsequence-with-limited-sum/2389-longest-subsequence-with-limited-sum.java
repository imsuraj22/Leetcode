class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
         Arrays.sort(nums);
        int answer[]=new int[queries.length];
        int j=0;
        for(int i=0;i<queries.length;i++){
            int num=queries[i];
            int sum=0;
           while(sum<num && j<nums.length){
                sum+=nums[j];
               if(sum<=num) j++;
                
            }
            answer[i]=j;
                j=0;
        }

        return answer;
    }
}