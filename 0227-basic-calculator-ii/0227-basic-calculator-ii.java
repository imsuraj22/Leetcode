class Solution {
    public int calculate(String s) {
        int len=s.length();
        if(s==null || s.length()==0) return 0;
        Stack<Integer> stack=new Stack<>();

        int num=0;
        char sign='+';

        for(int i=0;i<len;i++){
          if(Character.isDigit(s.charAt(i))){
            num=num*10+s.charAt(i)-'0';
          }

          if(i==len-1 || (!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ')){

            if(sign=='+'){
              stack.push(num);
            }
            if(sign=='-'){
              stack.add(-num);
            }
            if(sign=='*'){
              stack.add(stack.pop()*num);
            }
            if(sign=='/'){
              stack.add(stack.pop()/num);
            }

            sign=s.charAt(i);
            num=0;
          }
        }

        int res=0;
        for(int i:stack){
          res+=i;
        }

        return res;
    }
}