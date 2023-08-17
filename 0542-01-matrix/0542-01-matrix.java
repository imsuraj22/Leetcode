class Solution {
    int dir[]=new int[]{0,1,0,-1,0};
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q=new LinkedList<>();
        int m=mat.length;
        int n=mat[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0) q.add(new int[]{i,j});
                else{
                    mat[i][j]=-1;
                }
            }
        }

        while(!q.isEmpty()){
            int curr[]=q.poll();
            int r=curr[0],c=curr[1];

            for(int i=0;i<4;i++){
                int nr=r+dir[i];
                int nc=c+dir[i+1];

                if(nr==m || nc==n || nr<0 || nc<0 || mat[nr][nc]!=-1) continue;
                mat[nr][nc]=mat[r][c]+1;
                q.add(new int[]{nr,nc});
            }
        }

        return mat;
    }
}