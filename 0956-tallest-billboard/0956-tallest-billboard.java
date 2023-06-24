class Solution {
     public int tallestBillboard(int[] rods) {
        Map<Integer, Integer> dp = new HashMap<>(), cur;
        dp.put(0, 0);
        for (int x : rods) {
            cur = new HashMap<>(dp);
            for (int d : cur.keySet()) {
                dp.put(d + x, Math.max(cur.get(d), dp.getOrDefault(x + d, 0)));
                dp.put(Math.abs(d - x), Math.max(cur.get(d) + Math.min(d, x), dp.getOrDefault(Math.abs(d - x), 0)));
            }
        }
        return dp.get(0);
    }

    int helper(int rods[], int r1, int r2, int index){
        if(index==rods.length){
            if(r1==r2) return r1;
            else return 0;
        }
        int op1=helper(rods, r1+rods[index], r2, index++);
        int op2=helper(rods, r1, r2+rods[index], index++);
        int op3=helper(rods, r1, r2, index++);
        return Math.max(op1, Math.max(op2, op3));
    }
}