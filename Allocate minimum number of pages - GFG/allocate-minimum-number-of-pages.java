//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        
        if(M>A.length) return -1;
        int low=Integer.MAX_VALUE;
        int high=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
          if(A[i]<low) low=A[i];
          high+=A[i];
        }

        while(low<=high){

          int mid=(high+low)/2;

          if(isPossible(A,M,mid)){
            res=Math.min(res,mid);
            high=mid-1;
          }else{
            low=mid+1;
          }
        }

        return res;
    }

    static boolean isPossible(int arr[], int s, int barrier){
      int allocate=1, pages=0;

      for(int i=0;i<arr.length;i++){
        if(arr[i]>barrier) return false;
        if(pages+arr[i]>barrier){
          allocate++;
          pages=0;
          pages+=arr[i];
        }else{
          pages+=arr[i];
        }
      }

      if(allocate>s) return false;
      return true;
    }

};