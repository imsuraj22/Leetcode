class Solution {

    HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

   public Solution(int[] nums) {
       for(int i=0;i<nums.length;i++){
        map.computeIfAbsent(nums[i], l->new ArrayList<>()).add(i);
       }
  }
  
  public int pick(int target) {
      ArrayList<Integer> ans= map.get(target);
      int n=ans.size();
      Random random=new Random();
      int randomNumber=random.nextInt(n);
      return ans.get(randomNumber);
    // for(Integer it:map.keySet()){
    //   return map.get(key)
    // }
  }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */