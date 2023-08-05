class Solution {
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        //return solution(n,dp);
        return solutionTab(n);
    }
    
    
    //memoization solution
    int solution(int n, int dp[]){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=solution(i-1,dp)*solution(n-i,dp);
        }
        
        return dp[n]=ans;
    }
    
    
    //tabulation solution
    int solutionTab(int n){
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        
        return dp[n];
    }
}