class Solution {
    public void nextPermutation(int[] nums) {
         if(nums.length>=1) {
           
        
            int i=nums.length-2;
          int ind1=-1;
              
          int ind2=0;
          while(i>=0){
              if(nums[i]<nums[i+1]){
                  ind1=i;
                  break;
              }
              i--;
          }
             
         if(i<0){
            int j=0;
            int k=nums.length-1;
            while(j<k){
                int t=nums[j];
                nums[j]=nums[k];
                nums[k]=t;
                j++;
                k--;
            }
         }else{
            i=nums.length-1;
            while(i>=0){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
                i--;
            }
    
            int temp=nums[ind1];
            nums[ind1]=nums[ind2];
            nums[ind2]=temp;
            i=nums.length-1;
            ind1=ind1+1;
            while(ind1<i){
                 temp=nums[ind1];
                 nums[ind1]=nums[i];
                 nums[i]=temp;
                 i--;
                 ind1++;
    
            }
         }
          }
    }
}