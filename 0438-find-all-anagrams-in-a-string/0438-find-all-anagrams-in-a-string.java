class Solution {
   public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        p=sort(p);
        for(int i=0;i<=s.length()-p.length();i++){
            if(p.equals(sort(s.substring(i, i+p.length())))){
                res.add(i);
            }
        }
        return res;
    }
    String sort(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}