class Solution {
    public List<Integer> majorityElement(int[] nums) {
         Arrays.sort(nums);
         List<Integer> list=new ArrayList<>();
     int finalCoutn=0;
     if(nums.length==1){
        list.add(nums[0]);
        return list;
     }
     int majEle=0;
        boolean flag=false;
     int curr=0;
        float limit=nums.length/3;
     int currele=nums[0];
     for(int i=0;i<nums.length;i++){
         if(currele==nums[i]){
            curr++;
            if(curr>limit && flag==false) {
                list.add(nums[i]);
                finalCoutn=curr;
                majEle=currele;
                flag=true;
            }
         }else{
            currele=nums[i];
            curr=1;
             if(curr>limit){
                 list.add(nums[i]);
             }
             flag=false;
         }
     }

     return list;
    }
}