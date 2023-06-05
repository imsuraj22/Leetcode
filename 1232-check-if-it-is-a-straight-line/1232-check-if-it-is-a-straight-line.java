class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2) return true;

        int xcor=coordinates[1][0]-coordinates[0][0];
        int ycor=coordinates[1][1]-coordinates[0][1];

        for(int i=2;i<coordinates.length;i++){
            int currx=coordinates[i][0]-coordinates[i-1][0];
            int curry=coordinates[i][1]-coordinates[i-1][1];

            if(ycor*currx != xcor*curry) return false;
        }
        return true;
    }
}