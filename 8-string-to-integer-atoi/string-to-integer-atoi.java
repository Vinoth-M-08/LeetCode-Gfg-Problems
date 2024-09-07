class Solution {
    public int myAtoi(String s) {
        int i=0;
        long val=0;
        int flag=1;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        if(i<s.length() && (s.charAt(i)=='-'|| s.charAt(i)=='+')){
            flag=s.charAt(i)=='-'?-1:1;
            i++;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            val = val * 10 + (s.charAt(i) - '0');
            i++;

            if(val*flag < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(val*flag > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        return (int) (val * flag);
    }
}