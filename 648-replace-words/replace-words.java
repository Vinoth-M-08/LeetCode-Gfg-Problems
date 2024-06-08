class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String>dict=new HashSet<>(dictionary);
        StringBuilder sb = new StringBuilder();
        String words [] = sentence.split(" ");
        for(String wrd:words){
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(findhelper(wrd,dict));
        }
        return sb.toString();
    }
    public String findhelper(String word,Set<String>dict){
        for(int i=1;i<word.length();i++){
            String pre=word.substring(0,i);
            if(dict.contains(pre)){
                return pre;
            }
        }
        return word;
    }
}