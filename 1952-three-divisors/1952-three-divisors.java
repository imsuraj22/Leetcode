class Solution {
    public boolean isThree(int n) {
        if(n<=2) return false;
        
        int count=1;
        for(int i=2;i<=n;i++){
            if(n%i==0) count++;
        }
        
        if(count==3) return true;
        else return false;
    }
}