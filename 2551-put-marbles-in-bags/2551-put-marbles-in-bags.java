class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length-1;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=weights[i]+weights[i+1];
        }
        long res=0;
        Arrays.sort(b);
        for(int i=0;i<k-1;i++){
            res+=b[n-i-1]-b[i];
        }
        return res;
    }
}