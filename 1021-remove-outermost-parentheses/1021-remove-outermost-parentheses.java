class Solution {
    public String removeOuterParentheses(String s) {
         Stack<Character> stack=new Stack<>();
        List<Integer> l=new ArrayList<>();
        char[] ch=s.toCharArray();

        for(int i=0; i<ch.length;i++){
        if(stack.size()==0){
            l.add(i);
            stack.push(ch[i]);
            continue;
        }
        if(ch[i]=='(' && stack.peek()==')'){
            stack.pop();
            if(stack.size()==0){l.add(i);}
        }
        if(ch[i]==')' && stack.peek()=='('){
            stack.pop();
            if(stack.size()==0){l.add(i);}
        }else{
            stack.push(ch[i]);
        }
    }
    StringBuilder sb=new StringBuilder();
    for(int i=0; i<l.size()-1;i++){
        sb.append(s.substring(l.get(i)+1, l.get(i+1)));
    }
    return sb.toString();
        
    }
}