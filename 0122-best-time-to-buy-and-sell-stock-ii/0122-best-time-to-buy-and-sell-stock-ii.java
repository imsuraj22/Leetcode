class Solution {
    public int maxProfit(int[] prices) {
         int maxSofar=0;
        int maxCurr=0;

        for(int i=1;i<prices.length;i++){
            maxCurr=prices[i]-prices[i-1];
            maxCurr=Math.max(0,maxCurr);
            maxSofar+=maxCurr;
        }
        return maxSofar;
    }
}