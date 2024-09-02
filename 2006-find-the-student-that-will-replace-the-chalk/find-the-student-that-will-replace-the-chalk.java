class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long chalk_rem=0;
        for(int s:chalk){
            chalk_rem+=s;
        }
        k%=chalk_rem;
        for(int i=0;i<chalk.length;i++){
            if(k<chalk[i]){
                return i;
            }
            k-=chalk[i];
        }
        return -1;
    }
}