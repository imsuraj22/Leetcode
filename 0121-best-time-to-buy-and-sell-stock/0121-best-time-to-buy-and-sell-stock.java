class Solution {
    public int maxProfit(int[] a) {
        int maxProfit=0;
        int minSoFar=a[0];
        
        for(int i=0; i<a.length;i++){
            minSoFar =Math.min(minSoFar,a[i]);
            int profit=a[i]-minSoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
        
    }
}