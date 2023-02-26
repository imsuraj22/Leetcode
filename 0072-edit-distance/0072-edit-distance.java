class Solution {
    public int minDistance(String word1, String word2) {
      if(word1.length()==0) return word2.length();
      if(word2.length()==0) return word1.length();

      char ch1[]=word1.toCharArray();
      char ch2[]=word2.toCharArray();
      int cache[][]=new int[ch1.length][ch2.length];
      for(int i=0;i<ch1.length;i++){
        for(int j=0;j<ch2.length;j++){
          cache[i][j]=-1;
        }
      }

      return solution(0,0,ch1,ch2,cache);
    }

    int solution(int i, int j, char ch1[], char ch2[],int cache[][]){

      if(i==ch1.length) return ch2.length-j;
      if(ch2.length==j) return ch1.length-i;

      if(cache[i][j]!=-1) return cache[i][j];

      if(ch1[i]==ch2[j]) cache[i][j]=solution(i+1, j+1, ch1, ch2, cache);
      else{
        int replace=solution(i+1, j+1, ch1, ch2, cache);
        int delete=solution(i+1, j, ch1, ch2, cache);
        int insert=solution(i, j+1, ch1, ch2, cache);

        cache[i][j]=Math.min(replace, Math.min(insert, delete))+1;
      }

      return cache[i][j];
    }
}