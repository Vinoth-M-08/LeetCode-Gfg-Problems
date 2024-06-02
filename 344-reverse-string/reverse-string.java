class Solution {
    public void reverseString(char[] s) {
        char ans[] = new char[s.length];
        int k=0;
        for(int i=0;i<s.length;i++){
            ans[i]=s[i];
        }
        for(int i=s.length-1;i>=0;i--){
            s[k++]=ans[i];
        }
    }
}