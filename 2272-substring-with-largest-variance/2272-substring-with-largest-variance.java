class Solution {
    public int largestVariance(String s) {
        
        int ans=0;
        int[] arr=new int[26];
        StringBuilder str=new StringBuilder(s);
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(char ch1='a';ch1<='z';ch1++){
            for(char ch2='a';ch2<='z';ch2++){
                if(ch1==ch2 || arr[ch1-'a']==0 || arr[ch2-'a']==0){
                    continue;
                }

                for(int rev=0;rev<2;rev++){
                    int cnt1=0,cnt2=0;
                    for(int i=0;i<str.length();i++){
                        if(str.charAt(i)==ch1) cnt1++;
                        if(str.charAt(i)==ch2) cnt2++;

                        if(cnt1<cnt2){
                            cnt1=0;
                            cnt2=0;
                        }
                        if(cnt1>0 && cnt2>0){
                            ans=Math.max(ans, cnt1-cnt2);
                        }
                    }
                    str.reverse();
                }
            }
        }

        return ans;
    }
}