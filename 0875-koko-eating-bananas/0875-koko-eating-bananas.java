class Solution {
     public int minEatingSpeed(int[] piles, int H) {
        int l = 1, r = 1000000000;
        while (l < r) {
            int m = (l + r) / 2, total = 0;
            for (int p : piles)
                total += Math.ceil(p*1.0/m);
            if (total > H)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }
}