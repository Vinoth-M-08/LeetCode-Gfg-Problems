class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashSet<Character>list=new HashSet<>();
        for(char a:word.toCharArray()){
            list.add(a);
        }
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                if(list.contains(Character.toLowerCase(word.charAt(i)))){
                    count++;
                    list.remove(Character.toLowerCase(word.charAt(i)));
                }
            }
        }
        return count;
    }
}