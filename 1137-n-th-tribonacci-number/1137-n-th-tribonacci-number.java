class Solution {
    public int tribonacci(int n) {
        
        if(n==1 || n==2) return 1;
        if(n==3) return 2;
         int f=0,s=1,t=1;
        int ans=0;

        for(int i=3;i<=n;i++){
            ans+=f+s+t;
            f=s;
            s=t;
            t=ans;
            if(i!=n) ans=0;
        }
        return ans;
    }
}