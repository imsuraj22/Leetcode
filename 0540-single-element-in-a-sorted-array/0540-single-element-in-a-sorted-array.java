class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
Iterator<Integer> iterator = set.iterator();
int firstElement = iterator.next();
return firstElement;
    }
}