//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] prices = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.stockBuyAndSell(n, prices);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
   public static int stockBuyAndSell(int n, int[] prices) {
    int dp[][]=new int[n][2];
    for(int i=0;i<n;i++){
        Arrays.fill(dp[i], -1);
    }
        // code here
        return solution(0,prices,1,dp);
    }

    static int solution(int i, int prices[], int flag,int dp[][]){
        if(i==prices.length){
            return 0;

        }
        if(dp[i][flag]!=-1) return dp[i][flag];
        int profit=0;
        if(flag==1){
            profit=Math.max(-prices[i]+solution(i+1, prices, 0,dp), 0+solution(i+1, prices, 1,dp));
        }else{
            profit=Math.max(prices[i]+solution(i+1, prices, 1,dp), 0+solution(i+1, prices, 0,dp));
        }
        return dp[i][flag]=profit;

    }
}
        
