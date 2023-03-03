class Solution {
    public int strStr(String haystack, String needle) {
        int l1=haystack.length();
    int l2=needle.length();
    if (l1 < l2) {
      return -1;
  } else if (l2 == 0) {
      return 0;
  }
    int thresh=l1-l2;

    for(int i=0;i<=thresh;i++){
      if(haystack.substring(i, i+l2).equals(needle)){
        return i;
      }
    }
    return -1;
    }
}