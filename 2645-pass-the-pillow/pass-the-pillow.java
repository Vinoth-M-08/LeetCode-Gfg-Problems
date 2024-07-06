class Solution {
    public int passThePillow(int n, int time) {
        int rem=time%(n-1);
        int completed=time/(n-1);
        int ans=0;
        // n=4 t=5
        if(completed%2!=0){
            ans=n-rem;
        }else{
            ans=rem+1;
        }
        return ans;
    }
}