class Solution {
    public int bulbSwitch(int n) {
      return (int)Math.sqrt(n);

    }
    void fill(int arr[]){
      Arrays.fill(arr, 1);
    }
    void fillUp(int arr[], int i){
      for(int j=i;j<arr.length;j++){
        if(j%i==0){
          if(arr[j]==1) arr[j]=0;
          else arr[j]=1;
        }
      }
    }
}