class Solution {
    public String restoreString(String s, int[] indices) {
         int n=indices.length;
        char ans[]=new char[n];
        for(int i=0;i<indices.length;i++){
            int a=indices[i];
            ans[a]=s.charAt(i);
        }
         StringBuilder sb=new StringBuilder();
        for(int i=0;i<ans.length;i++){
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}