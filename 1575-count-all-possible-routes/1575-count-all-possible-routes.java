class Solution {
     public int countRoutes(int[] locations, int start, int finish, int fuel) {
        long[][] dp = new long[locations.length][fuel+1];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1l);
        return (int) count(locations,start,finish,fuel,dp);
    }
    
    public long count(int[] locations, int curr, int finish, int fuel,long[][] dp){
        if(fuel<0) return 0;
        if(dp[curr][fuel]!=-1) return dp[curr][fuel];
        long res = 0;
        if(curr==finish) res = 1;
        for(int i=0;i<locations.length;i++){
            if(i==curr) continue;
            int fuelAft = (fuel - Math.abs(locations[i]-locations[curr]));
            res=(res + count(locations,i,finish,fuelAft,dp))%1000000007;
        }
        dp[curr][fuel] =  res;
        return res;
    }
}