class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.add(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(st.size()>0 && st.peek()=='('){
                    st.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i)=='}'){
                if(st.size()>0 && st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i)==']'){
                if(st.size()>0 && st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.size()>0)return false;
        return true;
    }
}