//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int matrix[][] = new int[n][m];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(matrix, n, m);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        
        ArrayList<Integer> list=new ArrayList<>();
         if(matrix.length == 0 || matrix[0].length == 0) return list;
         int top=0;
         int bottom=matrix.length-1;
         int left=0;
         int right=matrix[0].length-1;

        int c=0;

         while(c<4){
            for(int i=left;i<=right;i++) list.add(matrix[top][i]);
            top++;
            if(top>bottom || left>right) break;
            c++;

            for(int i=top;i<=bottom;i++) list.add(matrix[i][right]);
            right--;
            if(top>bottom || left>right) break;
            c++;

            for(int i=right;i>=left;i--) list.add(matrix[bottom][i]);
            bottom--;
            if(top>bottom || left>right) break;
            c++;

            for(int i=bottom;i>=top;i--) list.add(matrix[i][left]);
            left++;
            if(top>bottom || left>right) break;
            c++;
         }

         return list;
    }
}
