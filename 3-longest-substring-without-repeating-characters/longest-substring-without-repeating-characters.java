class Solution {
    public int lengthOfLongestSubstring(String s) {
        int min=Integer.MIN_VALUE;
        HashSet<Character>set=new HashSet<>();
        int left=0;
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                while(left<i && set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(i));
            min=Math.max(min,i-left+1);
        }
        return min;
    }
}