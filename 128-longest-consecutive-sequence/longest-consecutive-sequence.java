class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>set=new HashSet<>();
        int long_ans=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int x=it;
                int cnt=1;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                long_ans=Math.max(cnt,long_ans);
            }
        }
        return long_ans;
    }
}