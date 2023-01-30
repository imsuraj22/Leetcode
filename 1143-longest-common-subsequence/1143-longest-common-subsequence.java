class Solution {
   int solution(int ind1,int ind2,String s1,String s2,int dp[][]){
        if(ind1<0 || ind2<0) return 0;

        if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];

        if(s1.charAt(ind1)==s2.charAt(ind2)) return dp[ind1][ind2]=1+solution(ind1-1, ind2-1, s1, s2,dp);

        return dp[ind1][ind2]= 0+Math.max(solution(ind1-1, ind2, s1, s2,dp), solution(ind1, ind2-1, s1, s2,dp));

    }

    public int longestCommonSubsequence(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int dp[][]=new int[n1][n2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }

        return solution(n1-1,n2-1,s,t,dp);
    }
}