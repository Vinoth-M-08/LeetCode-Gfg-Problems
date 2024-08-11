class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean [] freq=new boolean[nums.length];
        helper(ans,new ArrayList<>(),nums,freq);
        return ans;
    }
    public void helper(List<List<Integer>>ans,ArrayList<Integer>temp,int [] nums,boolean [] freq){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                temp.add(nums[i]);
                helper(ans,temp,nums,freq);
                temp.remove(temp.size()-1);
                freq[i]=false;
            }
        }
    }
}