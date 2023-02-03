class Solution {
    public String convert(String s, int numRows) {
        char[] c=s.toCharArray();
        int len=c.length;
        StringBuffer sb[]=new StringBuffer[numRows];

        for(int i=0;i<numRows;i++) sb[i]=new StringBuffer();

        int i=0;
        while(i<len){
            for(int ind=0;ind<numRows && i<len;ind++){
                sb[ind].append(c[i++]);
            }
            for(int ind=numRows-2;ind>=1 && i<len;ind--){
                sb[ind].append(c[i++]);
            }
        }
        for(int ind=1;ind<sb.length;ind++){
            sb[0].append(sb[ind]);
        }
        return sb[0].toString();
    }
}