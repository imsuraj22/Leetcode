class Solution {
    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
     }
     HashSet<Integer> set=new HashSet<>(list);
     for(int i=1;i<=nums.length+1;i++){
        if(!set.contains(i)){
            return i;
        }
     }
     return 1;
    }
}