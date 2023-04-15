class Solution {
   public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n=piles.size();
        int dp[][]=new int[n+1][k+1];
        return solution(0,piles,k,dp);
      }

      int solution(int i, List<List<Integer>> piles, int k, int dp[][]){
          if(dp[i][k]>0) return dp[i][k];
        if(i==piles.size() || k==0) return 0;
        
        
        int res=solution(i+1, piles, k, dp);
        int curr=0;
        for(int j=0;j<piles.get(i).size() && j<k;j++){
          curr+=piles.get(i).get(j);
          res=Math.max(res, solution(i+1, piles, k-j-1, dp)+curr);
        }

        dp[i][k]=res;
        return res;
      }
}