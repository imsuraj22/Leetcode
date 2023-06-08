class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int col=grid[0].length;
        //int res=0;
        int count=0;
        int lastNeg=col-1;
        for(int row=0;row<n;row++){
            if(grid[row][0]<-1){
                count+=col;
                continue;
            }
            if(grid[row][col-1]>0) continue;
            int l=0,r=lastNeg;
            while(l<=r){
                int m=(l+r)/2;
                if(grid[row][m]<0){
                    r=m-1;
                }else{
                    l=m+1;
                }
            }

            count+=(col-l);
        }

        return count;
    }
}