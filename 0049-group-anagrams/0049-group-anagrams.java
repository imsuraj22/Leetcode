class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
            if(map.containsKey(temp)){
                map.get(temp).add(strs[i]);
            }else{
                ArrayList<String> t=new ArrayList<>();
                t.add(strs[i]);
                map.put(temp,t);
            }
        }
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
}