class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==0) return list;
        if(nums.length==1) {
             list.add(Integer.toString(nums[0]));
             return list;
        }

        int start=nums[0];
        int end=nums[0];
        for(int i=1;i<nums.length;i++){
            int prev=nums[i-1]+1;
            if(nums[i]==prev){
                end=nums[i];
            }else{
                if(start!=end && end>start){
                    list.add(start+"->"+end);
                }else{
                    list.add(Integer.toString(start));
                }
                start=nums[i];
            }
        }
       if(end<start) list.add(Integer.toString(start));
        else list.add(start+"->"+end);
        return list;
    }
}