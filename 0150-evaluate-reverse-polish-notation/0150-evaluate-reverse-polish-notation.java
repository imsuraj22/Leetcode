class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String str : tokens){
            switch(str){
                case "+":
                    s.push(s.pop()+s.pop());
                    break;
                case "-":
                    int val1=s.pop();
                    s.push(s.pop()-val1);
                    break;
                case "*":
                    s.push(s.pop()*s.pop());
                    break;
                case "/":
                    int val=s.pop();
                    s.push(s.pop()/val);
                    break;
                default:
                    s.push(Integer.parseInt(str));
                    
            }
        }
        return s.pop();
    }
}