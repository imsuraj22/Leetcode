class Solution {
    
    public int closedIsland(int[][] grid) {
    int m=grid.length;
    int n=grid[0].length;

    //int max[][]=new int[m][n];
    int count=0;

    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(i*j==0 || j==n-1 ||i==m-1){
         if(grid[i][j]==0){
              dfs(i,j,grid,m,n);
         }
          
        }
      }
    }

    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
         if( grid[i][j]==0){
              count++;
          dfs(i,j,grid,m,n);
         
        }
      }
    }

    return count;

}


void dfs(int i, int j, int[][] grid, int m, int n){
      
      grid[i][j]=1;
    
    int ax[]={1,-1,0,0};
    int ay[]={0,0,1,-1};
    
    for(int k=0;k<4;k++){
        int nx=i+ax[k];
        int ny=j+ay[k];
        
        if(isValid(nx,ny,grid,m,n)){
            dfs(nx,ny,grid,m,n);
        }
    }

}
    
    boolean isValid(int i, int j, int[][] grid, int m, int n){
        if(i>=0 && i<m && j>=0 && j<n && grid[i][j]==0 ) return true;
        
        return false;
    }
}