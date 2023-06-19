//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        
        if(s.charAt(s.length()-1)=='.') return false;
    String parts[]=s.split("\\.");
    if(parts.length!=4) return false;

    for(String part:parts){
        if(hasLeadingzero(part)) return false;
        if(part.length()==0) return false;
        try{
            int num=Integer.parseInt(part);
            if(!isInRange(num)) return false;
        }catch(Exception e){
            return false;
        }
    }
    return true;
    
    }

    boolean isInRange(int num){
        if(num>=0 && num<=255) return true;
        return false;
    }

    boolean hasLeadingzero(String num){
        if(num.length()>1){
            if(num.charAt(0)=='0') return true;
        }
        return false;
    }
}