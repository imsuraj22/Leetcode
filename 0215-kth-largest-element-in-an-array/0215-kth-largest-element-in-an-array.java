class Solution {
     public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }

       int subtract=nums.length-k;
        while(!q.isEmpty() && subtract>0){
            q.poll();
            subtract--;
        }

        if(!q.isEmpty())return q.poll();
        return -1;
    }
}