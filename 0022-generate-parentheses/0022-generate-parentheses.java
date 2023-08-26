class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solution("",0,0,n,list);
        return list;
    }

    void solution(String str,int open, int close, int max,List<String> list){
        if(str.length()==max*2){
            list.add(str);
            return;
        }
        if(open<max){
            solution(str+"(", open+1, close, max, list);
        }
        if(close<open){
            solution(str+")", open, close+1, max, list);
        }
    }
}