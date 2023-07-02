class Solution {
    int ans=0;
  public int maximumRequests(int n, int[][] requests) {
        int temp[]=new int[n];
        help(0, requests, 0, temp);
        return ans;

  }

  void help(int i, int[][] requests, int l, int temp[]){
    if(i==requests.length){
        for(Integer it: temp) if(it!=0) return;
        ans=Math.max(ans, l);
        return;
    }

    help(i+1, requests, l, temp);
    temp[requests[i][0]]--;
    temp[requests[i][1]]++;
    help(i+1, requests, l+1, temp); 
    temp[requests[i][0]]++;
    temp[requests[i][1]]--;
  }
}