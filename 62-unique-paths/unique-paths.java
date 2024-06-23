class Solution {
    public int uniquePaths(int m, int n) {
        //i=2 j=3
       int [][] arr=new int[m][n];
        for(int i=0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = -1;
            }
        }
       int k= helper(0,0,arr);
       return k;
    }
    public int helper(int i,int j,int arr[][]){
        int m=arr.length;int n=arr[0].length;
        if((i>=m)||(j>=n)){
            return 0;
        }else if((i==m-1)&&(j==n-1)){
            return 1;
        }
        if(arr[i][j]!=-1)return arr[i][j];
        else return arr[i][j]=helper(i+1,j,arr)+helper(i,j+1,arr);
    }
}