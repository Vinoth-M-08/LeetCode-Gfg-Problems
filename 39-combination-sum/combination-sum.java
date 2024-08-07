class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,arr,target,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int idx,int [] arr,int target,List<List<Integer>> ans,ArrayList<Integer>ds){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            helper(idx,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
            helper(idx+1,arr,target,ans,ds);
    }
}