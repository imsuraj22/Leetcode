//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
                
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t-- > 0){
	            String tt= br.readLine();
	            Node rootT = buildTree(tt);
	            
	            String s= br.readLine();
	            Node rootS = buildTree(s);
	           // printInorder(root);
	            
	            Solution tr=new Solution();
	            boolean st=tr.isSubtree(rootT, rootS);
	            if(st==true){
	                System.out.println("1");
	            }else{
	                System.out.println("0");
	            }
	        }
	}
}
// } Driver Code Ends


//User function Template for Java

/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    Node r1,r2;
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(S==null) return true;
        if(T==null) return false;
        
        if(identical(T,S)){
            return true;
        }
        return isSubtree(T.left,S)|| isSubtree(T.right,S);
    }
    
    static boolean identical(Node r1, Node r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        
       // if(r1.data==r2.data) return true;
        
        return (r1.data==r2.data && identical(r1.left,r2.left) && identical(r1.right, r2.right));
        
    }
}