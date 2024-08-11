class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char board[][]=new char [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int [] leftrow=new int [n];
        int [] upper_diagonal=new int[2*n];
        int [] lower_diagonal=new int[2*n];
        solve(0,board,ans,leftrow,upper_diagonal,lower_diagonal);
        return ans;
    }
    public void solve(int col,char [][] board,List<List<String>>ans,int [] leftrow,int []upper_diagonal,int [] lower_diagonal){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(leftrow[row]==0 && upper_diagonal[(board.length-1)+row-col]==0 && lower_diagonal[row+col]==0){
                leftrow[row]=1;
                lower_diagonal[row+col]=1;
                upper_diagonal[(board.length-1)+row-col]=1;
                board[row][col]='Q';
                solve(col+1,board,ans,leftrow,upper_diagonal,lower_diagonal);
                leftrow[row]=0;
                lower_diagonal[row+col]=0;
                board[row][col]='.';
                upper_diagonal[(board.length-1)+row-col]=0;
            }
        }
    }
        
        public List<String> construct(char [][]board){
            ArrayList<String>list=new ArrayList<>();
            for(int i=0;i<board.length;i++){   
                String s= new String(board[i]);
                    list.add(s);
            }
            return list;
        }
    }