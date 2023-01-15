class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2) return "";
        
        HashSet<Character> set=new HashSet();
        for(int i=0; i<s.length();i++){
            set.add(s.charAt(i));
        }
        
        for(int i=0; i<s.length();i++){
            if(set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i))) ){
continue;
}
            String prev= longestNiceSubstring(s.substring(0, i));
            String next=longestNiceSubstring(s.substring(i+1));
            
            return prev.length()>=next.length()?prev:next;
        }
        return s;
    }
}