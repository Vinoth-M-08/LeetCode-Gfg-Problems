class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        helper(0,s,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int idx,String s,List<List<String>>ans,ArrayList<String>ds){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                String k=s.substring(idx,i+1);
                ds.add(k);
                helper(i+1,s,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    private static boolean isPalindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left++)!=s.charAt(right--))
                return false;
        }
        return true;
    }
}