class Solution {
    public void sortColors(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int i=0;
        while(!pq.isEmpty()){
            int temp=pq.poll();
            nums[i]=temp;
            i++;
        }
    }
}