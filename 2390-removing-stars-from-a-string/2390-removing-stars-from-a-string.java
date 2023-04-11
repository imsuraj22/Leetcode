class Solution {
    public String removeStars(String s) {
        Deque<Character> q=new ArrayDeque<>();

          for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
              q.removeLast();
            }else{
              q.addLast(s.charAt(i));
            }
          }

          String ans="";
          while(!q.isEmpty()){
            ans+=q.getFirst();
               q.pollFirst();
          }

          return ans;
    }
}