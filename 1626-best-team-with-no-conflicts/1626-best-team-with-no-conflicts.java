class Solution {
   public int bestTeamScore(int[] scores, int[] ages) {
     
        int n=ages.length;
        int agePair[][]=new int[n][2];

        for(int i=0;i<n;i++){
            agePair[i][0]=ages[i];
            agePair[i][1]=scores[i];
        }

        Arrays.sort(agePair,(a,b)->
            a[0]==b[0]?a[1]-b[1]:a[0]-b[0]
        );

        int dp[][]=new int[n][n];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }

        return  solution(agePair,-1,0,dp);
    }

    int solution(int[][] agePair, int prev, int ind, int dp[][]){
        if(ind>=agePair.length){
            return 0;
        }

        if(dp[prev+1][ind]!=-1) return dp[prev+1][ind];

        if(prev==-1 || agePair[ind][1]>=agePair[prev][1]){
            return dp[prev+1][ind]=Math.max(solution(agePair, prev, ind+1, dp), agePair[ind][1]+solution(agePair, ind, ind+1, dp));

        }

        return dp[prev+1][1]=solution(agePair, prev, ind+1, dp);

    }

}