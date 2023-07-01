class Solution {
     public int distributeCookies(int[] cookies, int k){
        int[] ppl = new int[k];
        return helper(cookies, ppl, 0);
    }
    
    public int helper(int[] cookies, int[] ppl, int idx){
        if(idx == cookies.length){
            int ans = 0;
            for(int num: ppl){
                ans = Math.max(num, ans);
            }
            return ans;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < ppl.length; i++){
            ppl[i] += cookies[idx];
            res = Math.min(res, helper(cookies, ppl, idx+1));
            ppl[i] -= cookies[idx];
        }
        return res;
    }
}