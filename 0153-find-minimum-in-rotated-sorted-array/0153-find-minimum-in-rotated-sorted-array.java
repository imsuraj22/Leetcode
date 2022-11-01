class Solution {
    public int findMin(int[] nums) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        int temp=q.poll();
        return temp;
    }
}