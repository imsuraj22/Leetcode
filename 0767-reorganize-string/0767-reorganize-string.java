class Solution {
        public String reorganizeString(String s) {
int charcounts[]=new int[26];
        for(int i=0;i<s.length();i++){
            charcounts[s.charAt(i)-'a']=charcounts[s.charAt(i)-'a']+1;
        }
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->Integer.compare(b[1], a[1]));
        for(int i=0;i<26;i++){
            if(charcounts[i]>0){
                q.add(new int[]{i+'a',charcounts[i]});
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){
            int[]curr=q.poll();
            if(sb.length()==0 || curr[0]!=sb.charAt(sb.length()-1)){
                sb.append((char)curr[0]);
                if(curr[1]>1){
                    curr[1]--;
                    q.add(curr);
                
                }
            }else{
                if(q.isEmpty()){
                    return "";
                }
                int second[]=q.poll();
                sb.append((char)second[0]);
                if(second[1]>1){
                    second[1]--;
                    q.add(second);
                }
                q.add(curr);
            }
        }
        return sb.toString();
        }
}