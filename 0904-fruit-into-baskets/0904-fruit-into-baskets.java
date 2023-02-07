class Solution {
        public int totalFruit(int[] fruits) {
            if(fruits.length==0) return 0;
        int res=0,i=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<fruits.length;j++){
            map.put(fruits[j], map.getOrDefault(fruits[j], 0)+1);

            if(map.size()>2){
                map.put(fruits[i], map.get(fruits[i])-1);
                if(map.get(fruits[i])==0) map.remove(fruits[i]);
                i++;
            }
            res=Math.max(res, j-i+1);
        }
        return res;
        }
}