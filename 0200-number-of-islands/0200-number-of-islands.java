class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        if(row==0){
            return 0;
        }
        int col=grid[0].length;
        int no_of_islands=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    make_current_island(grid,i,j,row,col);
                    no_of_islands+=1;
                }
            }
        }
        return no_of_islands;
    }
    
    void make_current_island(char[][] matrix, int x, int y, int r, int c){
        if(x<0 || x>=r || y<0 || y>=c ||matrix[x][y]!='1'){
            return;
        }
        matrix[x][y]='2';
        make_current_island(matrix,x+1,y,r,c);
        make_current_island(matrix,x,y+1,r,c);
        make_current_island(matrix,x-1,y,r,c);
        make_current_island(matrix,x,y-1,r,c);
    }
}