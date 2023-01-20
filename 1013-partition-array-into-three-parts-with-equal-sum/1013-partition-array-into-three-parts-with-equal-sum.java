class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0,leftSum=0,count=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/3;
        for(int i=0;i<arr.length;i++){
            leftSum+=arr[i];
            if(leftSum==avg){
                count++;
                leftSum=0;
            }
        }
        return count>=3 && sum%3==0;
}
}