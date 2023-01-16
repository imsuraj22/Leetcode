class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){

            if(intervals[i][1]<newInterval[0]) list.add(intervals[i]);
            else if(intervals[i][0]>newInterval[1]){
                list.add(newInterval);
                newInterval=intervals[i];
            }
            else{
                newInterval[0]=Math.min(intervals[i][0], newInterval[0]);
                newInterval[1]=Math.max(intervals[i][1], newInterval[1]);
            }

        }
        list.add(newInterval);
        int ans[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}