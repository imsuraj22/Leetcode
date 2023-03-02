class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
    int i=0,j=0;
    
    while(j<chars.length){
      int count=0;
      char curr=chars[j];
      //count++;
       
      while(j<chars.length && curr==chars[j]){
        count++;
        j++;
      }
      chars[i++] = curr;
      if(count != 1)
          for(char c : Integer.toString(count).toCharArray()) 
              chars[i++] = c;

    }

    return i;
    }
}