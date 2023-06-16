//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
    // code here

    int res=0;
    for(int i=0;i<str.length();i++){
        int s1=value(str.charAt(i));

        if(i+1<str.length()){
            int s2=value(str.charAt(i+1));

            if(s1>=s2){
                res=res+s1;
            }else{
                res=res+s2-s1;
                i++;
            }
        }else{
            res=res+s1;
        }
    }
    return res;

}

int value(char c){
    if(c=='I') return 1;
    else if(c=='V') return 5;
    else if(c=='X') return 10;
    else if(c=='L') return 50;
    else if(c=='C') return 100;
    else if(c=='D') return 500;
    else if(c=='M') return 1000;
    else return -1;
}
}