class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char ch[]=s.toCharArray();

        for(int i=0;i<ch.length;i++){
          if(ch[i]=='('||ch[i]=='['||ch[i]=='{'){
            stack.add(ch[i]);
          }
          else{
            if(stack.size()==0) return false;
            if(ch[i]==')'){
              if(stack.peek()!='(') return false;
              else stack.pop();
            }
            if(ch[i]=='}'){
              if(stack.peek()!='{') return false;
              else stack.pop();
            }
            if(ch[i]==']'){
              if(stack.peek()!='[') return false;
              else stack.pop();
            }
          }
        }
        if(stack.size()>0) return false;
        return true;


}
}