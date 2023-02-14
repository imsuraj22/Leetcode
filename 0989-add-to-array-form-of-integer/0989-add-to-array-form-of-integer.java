class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        ArrayList<Integer> ans=new ArrayList<>();

        int curr=k;
        int n=num.length;
        int i=n-1;
        
        while(i>=0 || curr>0){
            if(i>=0)
                curr+=num[i];
            ans.add(curr%10);
            curr=curr/10;
            
            i--;
        }

         Collections.reverse(ans);
        return ans;
    }
}