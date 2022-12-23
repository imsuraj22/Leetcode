class Solution {
    
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return findSolution(n,dp);
    }
    int findSolution(int n,int[] dp){
        if(n==0) return 1;
        if(n==1) return 1;
        
        if(dp[n]!=-1) return dp[n];
        int left=findSolution(n-1,dp);
        int right=findSolution(n-2,dp);
        return dp[n]=left+right;
    }
}