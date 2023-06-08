class Pair{
    int i;
    int j;
    Pair(int i, int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Pair> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    list.add(new Pair(i, j));
                }
            }
        }

        for(int i=0;i<list.size();i++){
            Pair p=list.get(i);
            convertZero(p.i, p.j, matrix, n-1, m-1);
        }
    }
    
    void convertZero(int i, int j, int matrix[][], int n, int m){
        if(i==0 && j==0){
            while(i<=n){
                matrix[i][j]=0;
                i++;
            }
            i=0;
            while(j<=m){
                matrix[i][j]=0;
                j++;
            }
        }else if(i==n && j==0){
            while(i>=0){
                matrix[i][j]=0;
                i--;
            }
            i=n;
            while(j<=m){
                matrix[i][j]=0;
                j++;
            }
        }else if(i==n && j==m){
            while(i>=0){
                matrix[i][j]=0;
                i--;
            }i=n;
            while(j>=0){
                matrix[i][j]=0;
                j--;
            }
        }else if(i==0 && j==m){
            while(i<=n){
                matrix[i][j]=0;
                i++;
            }
            i=0;
            while(j>=0){
                matrix[i][j]=0;
                j--;
            }
        }
        else{
            int k=0;
        int l=j;
        while(k<=n){
            matrix[k][j]=0;
            k++;
        }
        k=i;
        j=0;
        while(j<=m){
            matrix[k][j]=0;
            j++;
        }
        }

    }
}