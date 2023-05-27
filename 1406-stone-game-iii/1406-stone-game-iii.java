class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int alice=helper(stoneValue, 0, n,dp);
        if(alice>0) return "Alice";
        else if(alice==0) return "Tie";
        else return "Bob";
    }

    int helper(int []stoneValue, int i, int n, int dp[]){
      if(i==n)return 0;
      else{
          if(dp[i]!=-1) return dp[i];
        int ans=Integer.MIN_VALUE;
        ans=Math.max(ans, stoneValue[i]-helper(stoneValue, i+1, n,dp));
        if(i+1<n) ans=Math.max(ans, stoneValue[i]+stoneValue[i+1]-helper(stoneValue, i+2, n,dp));
        if(i+2<n) ans=Math.max(ans, stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-helper(stoneValue, i+3, n,dp));

        return dp[i]= ans;
      }
    }
}