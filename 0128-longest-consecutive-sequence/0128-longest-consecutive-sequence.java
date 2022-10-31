class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int current=nums[i];
                int currentCount=1;
                
                while(set.contains(current+1)){
                    current+=1;
                    currentCount+=1;
                }
                
                max=Math.max(max,currentCount);
            }
        }
        return max;
    }
}