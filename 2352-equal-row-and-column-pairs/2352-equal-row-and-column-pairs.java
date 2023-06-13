class Solution {
   public int equalPairs(int[][] grid) {
        
        int count=0;
        for(int i=0;i<grid.length;i++){
            count+=solve(grid[i], grid);
        }
        return count;

    }

    int solve(int arr[], int [][] grid){

       int n=grid.length;
        boolean flag=true;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[j][i]==arr[j]){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
             if(flag) {
                count++;
             }
        }
       
        return count;
    }
}