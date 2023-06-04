class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int i=0;
        int j=matrix[0].length-1;
        while(i<n && j>=0){
            
            if(target==matrix[i][j]){
                return true;
            }
            if(target>matrix[i][j]){
                i++;
            }else if(target<matrix[i][j]){
                j--;
            }
            if(i==n || j<0) return false;
            
        }

        return false;
    }
}