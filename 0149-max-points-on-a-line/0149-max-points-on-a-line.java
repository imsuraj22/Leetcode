class Solution {
    public int maxPoints(int[][] points) {
        if(points.length==1) return 1;
        int max = 2;
       
        
        for(int i=0;i<points.length;i++){
                int x1 = points[i][0], y1 = points[i][1];
            for(int j=i+1;j<points.length;j++){
                int x2 = points[j][0], y2 = points[j][1], cnt=2;
                for(int k=j+1;k<points.length;k++){
                    int x3 = points[k][0], y3 = points[k][1];
                    if((x3-x1)*(y2-y1)==(y3-y1)*(x2-x1)) cnt++;
                }
                max = Math.max(max,cnt);
            }
        }
        return max;
    }
}