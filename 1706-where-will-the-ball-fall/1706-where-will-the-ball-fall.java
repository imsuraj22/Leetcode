class Solution {
    public int[] findBall(int[][] grid) {
        
        int col=grid[0].length;
        int arr[]=new int[col];
        for(int i=0;i<col;i++){
            arr[i]=dfs(0,i,grid);
        }
        return arr;
    }
    
    
    int dfs(int i,int j, int[][] grid){
        if(i>=grid.length){
            return j;
        }
        
        if(grid[i][j]==1 && j+1<grid[0].length && grid[i][j+1]==1){
            return dfs(i+1,j+1,grid);
        }
        else if(grid[i][j]==-1 && j-1>=0 && grid[i][j-1]==-1){
            return dfs(i+1,j-1,grid);
        }else if(grid[i][j]==1 && j+1>=grid.length){
            return -1;
        }else{
            return -1;
        }
    }
}