//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> result=new ArrayList<>();
        
        int size=0,c=0;
         size=1;
        result.add(0,1);
        
       
        
        int val=2;
        while(val<=N){
            for(int i=size-1;i>=0;i--){
                int temp=result.get(i)*val+c;
                result.set(i,temp%10);
                c=temp/10;
            }
            
            while(c!=0){
                result.add(0,c%10);
                c=c/10;
                size++;
            }
            val++;
        }
        return result;
    }
}