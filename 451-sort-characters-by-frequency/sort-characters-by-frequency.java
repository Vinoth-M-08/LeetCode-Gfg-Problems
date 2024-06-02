class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        List<Character>list=new ArrayList<>(map.keySet());
        Collections.sort(list ,(a,b)->map.get(b)-map.get(a));
        StringBuilder sb=new StringBuilder();
        for(Character ch: list){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    // return "helo";
    }
}