class Solution {
    public String getPermutation(int n, int k) {
        k=k-1;
        int fact=1;
        ArrayList<Integer>numbers=new ArrayList<>();
        for(int i=1;i<n;i++){
            numbers.add(i);
            fact=fact*i;
        }
        numbers.add(n);
        String str="";
        while(true){
            str=str+numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/numbers.size();
        }
        return str;
    }
}