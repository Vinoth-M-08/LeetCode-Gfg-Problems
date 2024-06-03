class Solution {
    public int appendCharacters(String s, String t) {
        int s_length=s.length();
        int t_length=t.length();
        int s_Index=0;
        int t_Index=0;
        while(s_Index<s_length && t_Index<t_length){
            if(s.charAt(s_Index)==t.charAt(t_Index)){
                t_Index++;
            }
            s_Index++;
        }

        return t_length-t_Index;
    }
}