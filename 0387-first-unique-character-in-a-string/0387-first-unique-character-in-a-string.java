class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
       
        int no=-1;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }else{
                map.put(ch[i],1);
            }
        }
        
        for(int i=0;i<ch.length;i++){
            int val=map.get(ch[i]);
            if(val==1){
                no=i;
                break;
            }
        }
        return no;
    }
}