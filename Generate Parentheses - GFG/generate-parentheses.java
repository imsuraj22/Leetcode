//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solution("",0,0,n,list);
        return list;
    }

    void solution(String str,int open, int close, int max,List<String> list){
        if(str.length()==max*2){
            list.add(str);
            return;
        }
        if(open<max){
            solution(str+"(", open+1, close, max, list);
        }
        if(close<open){
            solution(str+")", open, close+1, max, list);
        }
    }
}