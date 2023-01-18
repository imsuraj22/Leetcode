class Solution {
    public int maximumValue(String[] strs) {
       int max=0;
        int i,j;


        for( i=0;i<strs.length;i++){
            j=0;
            while(j<strs[i].length() && (strs[i].charAt(j)>= 48 && strs[i].charAt(j)<=57)){
                j++;
            }

            if(strs[i].length()==j){
                if(Integer.parseInt(strs[i])>max){
                    max=Integer.parseInt(strs[i]);
                }
            }else{
                if(max<strs[i].length()){
                    max=strs[i].length();
                }
            }
        }
        return max;
    }
}