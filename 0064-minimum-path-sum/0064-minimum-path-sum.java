class Solution {
    public int minPathSum(int[][] grid) {
    int row=grid.length-1;
    int col=grid[0].length-1;
    int dp[][]=new int[row+1][col+1];

    return solution(row,col,dp,grid);

}


int solution(int row, int col, int dp[][], int grid[][]){
    if(row==0 && col==0) return grid[row][col];

    if(dp[row][col]!=0) return dp[row][col];
    if(row!=0 && col==0){
        return dp[row][col]=grid[row][col]+solution(row-1, col, dp, grid);
    }
    if(row==0 && col!=0){
        return dp[row][col]=grid[row][col]+solution(row, col-1, dp, grid);
    }

    return dp[row][col]=grid[row][col]+Math.min(solution(row-1, col, dp, grid), solution(row, col-1, dp, grid));
}
}