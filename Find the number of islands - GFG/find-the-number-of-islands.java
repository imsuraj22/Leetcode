//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        int visited[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && grid[i][j] == '1') {
                     count++;
                    bfs(i, j, visited, grid);
                   
                }
            }
        }
        return count;
    }
    void bfs(int i, int j, int visited[][], char[][] grid) {
        visited[i][j]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i, j));
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.poll();

            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int nrow=row+delrow;
                    int ncol=col+delcol;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m
                    && visited[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                       
                        visited[nrow][ncol]=1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }
}