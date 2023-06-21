//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);

            Solution ob = new Solution();
            System.out.println(ob.sumOfNaturals(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     static int MOD = 1000000007; 
static int sumOfNaturals(int n) {
  
  //return (int) (((long) n * (n + 1)) % (int) (1e9 + 7)) / 2;
  
  return (int) (((long) n * ( n + 1 ) ) % (int)(1e9+7))/2;
}
static long sum(int n){
    if(n==1) return 1;
    return n+sum(n-1);
}
};