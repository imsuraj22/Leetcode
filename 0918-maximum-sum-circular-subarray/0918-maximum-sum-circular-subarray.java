class Solution {
        public int maxSubarraySumCircular(int[] nums) {
           
          
          int total=0;
          for(int i=0;i<nums.length;i++){
            total+=nums[i];
          }

          int minSum=kadaneMin(nums);
          int maxSum=kadaneMax(nums);
        if(minSum==total) return maxSum;
        else return Math.max(maxSum, total-minSum);
        }
        int kadaneMin(int arr[]){
            int curr=arr[0];
            int minSofar=arr[0];

            for(int i=1;i<arr.length;i++){
                if(curr+arr[i]<arr[i]){
                    curr+=arr[i];
                }else{
                    curr=arr[i];
                }

                minSofar=Math.min(minSofar, curr);
            }
            return minSofar;
        }

        int kadaneMax(int arr[]){
            int curr=arr[0];
            int maxSofar=arr[0];

            for(int i=1;i<arr.length;i++){
                if(curr+arr[i]>arr[i]){
                    curr+=arr[i];
                }else{
                    curr=arr[i];
                }
                maxSofar=Math.max(maxSofar, curr);
            }
            return maxSofar;
        }
        
}