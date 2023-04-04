class Solution {
    public int partitionString(String s) {
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set =new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
          char curr=s.charAt(i);
          if(!set.contains(curr)){
            set.add(curr);
          }
          else{
            set.clear();

            set.add(curr);
            count++;
          }
        }
        if(set.size()>0) count++;

        return count;
    }
}