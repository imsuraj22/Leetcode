class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n+1][n];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        return solution(-1,0,nums,dp);
    }

    int solution(int prev, int i, int arr[],int dp[][]){
        if(i==arr.length) return 0;
        if(dp[prev+1][i]!=-1) return dp[prev+1][i];
        int nontake=solution(prev, i+1, arr,dp);
        int take=0;
        if(prev==-1 || arr[prev]<arr[i]){
            take=1+solution(i, i+1, arr,dp);
        }
        return dp[prev+1][i]=Math.max(nontake, take);
    }
}