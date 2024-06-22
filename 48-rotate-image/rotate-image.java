class Solution {
    public void rotate(int[][] matrix) {
       int m=matrix.length;
       int [][]ro=new int [m][m];
       for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            ro[j][m-i-1]=matrix[i][j];
        }
       }
       for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=ro[i][j];
        }
       }
    }
}