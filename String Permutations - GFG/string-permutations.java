//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
        public ArrayList<String> permutation(String S)
    {
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        boolean freq[]=new boolean[S.length()];

        permute(S,ans,sb,freq);
        Collections.sort(ans);
        return ans;

        
    }

    void permute(String s,ArrayList<String> ans,StringBuilder ds,boolean freq[]){
        if(ds.length()==s.length()){
            ans.add(ds.toString());
            return;
        }

        for(int i=0;i<s.length();i++){
            if(!freq[i]){
                freq[i]=true;
                ds.append(s.charAt(i));
                permute(s, ans, ds, freq);
                ds.deleteCharAt(ds.length()-1);
                freq[i]=false;
            }
        }

    }
	   
}
