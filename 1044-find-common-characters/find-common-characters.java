class Solution {
    public List<String> commonChars(String[] words) {
        int [] minFreq=new int[26];
        Arrays.fill(minFreq,Integer.MAX_VALUE);
        for(String word:words){
            int [] arr=new int[26];
            for(char ch:word.toCharArray()){
                arr[ch - 'a']++;
            }
            for(int i=0;i<26;i++){
            minFreq[i]=Math.min(minFreq[i],arr[i]);
            }
        }
        ArrayList<String>list=new ArrayList<>();      
        for(int i=0;i<26;i++){
            if(minFreq[i]>0){
                for(int j=0;j<minFreq[i];j++)
                list.add(Character.toString((char)i+'a'));
            }
            minFreq[i]--;
        }
        return list;
    }
}