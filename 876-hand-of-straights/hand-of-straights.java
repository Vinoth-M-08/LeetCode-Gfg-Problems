class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
        return false;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<hand.length;i++){
            al.add(hand[i]);
        }
        Collections.sort(al);
        for(int i=0;i<hand.length/groupSize;i++){
            int d=al.get(0);
            System.out.println(d);
            for(int j=0;j<groupSize;j++){
                if(al.contains(d)){
                    al.remove(Integer.valueOf(d));
                    System.out.println(d+" yes ");
                }
                else
                return false;
                d++;
            }
        }
        return true;
    }
}