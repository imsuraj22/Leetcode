//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        boolean freq[]=new boolean[S.length()];

        permute(S,ans,sb,freq);
        Collections.sort(ans);
        return ans;
    }
    
    
    void permute(String s,List<String> ans,StringBuilder ds,boolean freq[]){
        if(ds.length()==s.length()){
           if(!ans.contains(ds.toString()))ans.add(ds.toString());
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