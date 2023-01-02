class Solution {
    public String capitalizeTitle(String title) {
         String arr[]=title.split(" ");
        String res[]=new String[arr.length];

        for(int i=0;i<arr.length;i++){
           StringBuilder temp;
            String curr=arr[i];
            if(curr.length()>2){
                temp=new StringBuilder(curr.toLowerCase());
            char ch=Character.toUpperCase(temp.charAt(0));
                temp.replace(0,1,Character.toString(ch));
            }else{
                temp=new StringBuilder(curr.toLowerCase());
            }

            res[i]=temp.toString();
        }


        StringBuffer sb=new StringBuffer();
        for(int i=0;i<res.length-1;i++){
            sb.append(res[i]+" ");
        }
        sb.append(res[res.length-1]);


        return sb.toString();

        
    }
}