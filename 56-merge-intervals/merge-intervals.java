class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end =intervals[i][1];
            //[1,6]
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(intervals[j][1],end);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        System.out.print(ans);
        int f_ans[][]=new int[ans.size()][2];
        for(int i=0;i<f_ans.length;i++){
            for(int j=0;j<2;j++){
                f_ans[i][j]=ans.get(i).get(j);
            }
        }
        return f_ans;
    }
}