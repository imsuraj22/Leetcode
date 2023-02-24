class Solution {
    public int minimumDeviation(int[] nums) {
         PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        int min=Integer.MAX_VALUE;
        int diff=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
          
          if(nums[i]%2!=0) nums[i]=nums[i]*2;

        }

        for(int i=0;i<nums.length;i++){
          if(nums[i]<min) min=nums[i];
          q.add(nums[i]);
        }

        while(true){

          int curr=q.poll();
          diff=Math.min(diff, curr-min);
            min=Math.min(curr/2,min);
          if(curr%2==0){
            q.add(curr/2);
          }else{
            break;
          }



        }

        return diff;
    }
}