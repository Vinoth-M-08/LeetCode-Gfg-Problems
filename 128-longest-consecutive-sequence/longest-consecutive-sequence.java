class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int long_seq=0;
        for(int it:list){
            if(!list.contains(it-1)){
                int cnt=1;
                int x=it;
                while(list.contains(x+1)){
                    cnt++;
                    x++;
                }
                long_seq=Math.max(long_seq,cnt);
            }
        }
        return long_seq;
    }
}