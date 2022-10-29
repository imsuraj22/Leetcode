//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        int currsum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                currsum+=-1;
            }
            if(arr[i]==1){
                currsum+=1;
            }
            
            if(currsum==0){
                count++;
            }
            
            if(map.containsKey(currsum)){
                count+=map.get(currsum);
                map.put(currsum,map.get(currsum)+1);
            }else{
                map.put(currsum,1);
            }
        }
        return count;
    }
}


