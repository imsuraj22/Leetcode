class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       
     
         for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0) nums[i]=1;
        else nums[i]=0;
     }
     HashMap<Integer,Integer> map=new HashMap<>();

     int sum=0;
        int count=0;
     map.put(0, 1);
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
        }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        
     }
     return count;
    }
}