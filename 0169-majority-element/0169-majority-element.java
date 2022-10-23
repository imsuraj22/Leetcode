class Solution {
    public int majorityElement(int[] nums) {
        
       HashMap<Integer, Integer> map=new HashMap<>();
        Arrays.sort(nums);
        int max=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int val=1;
            if(map.containsKey(temp)){
                int a =map.get(temp);
                val=val+a;
                if(val>max){
                    max=val;
                    ele=temp;
                }
            }
            map.put(temp, val);
        }
        return ele;
    }
}