class Solution {
    public String longestPalindrome(String s) {
        String answer="";
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s, i, j) && j-i+1 >answer.length()){
                    answer=s.substring(i, j+1);
                }
            }
        }
        return answer;
    }

    boolean isPalindrome(String str, int low, int high){
        while(low<high){
            if(str.charAt(low)!=str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}