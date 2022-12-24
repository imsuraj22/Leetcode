class Solution {
    
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solution(n,dp);
    }
    int solution(int ind,int dp[]){
        if(ind==0) return 1;
        if(ind==1) return 1;
        if(dp[ind]!=-1) return dp[ind];
        int left=solution(ind-1,dp);
        int right=solution(ind-2,dp);
        
        return dp[ind]=left+right;
    }
}