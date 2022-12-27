
class Solution {
   
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int arr[]=new int[rocks.length];
        int fill=0;
        for(int i=0;i<capacity.length;i++){
            arr[i]=capacity[i]-rocks[i];

        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) fill++;
            else{
                if(additionalRocks>=arr[i]){
                additionalRocks-=arr[i];
                fill++;
                }else{
                    break;
                }
                
            }
            
        }
        return fill;
    }
}