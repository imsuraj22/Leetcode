class Solution {
     public int maxProfit(int[] prices, int fee) {
      if (prices.length == 0) {
        return 0;
      }
      int s0 = 0;
      int s1 = -prices[0];
      for (int i = 1; i < prices.length; i++) {
        s1 = Math.max(s1, s0 - prices[i]);
        s0 = Math.max(s0, prices[i] + s1 - fee);
      }
      
      return s0;
    }
}