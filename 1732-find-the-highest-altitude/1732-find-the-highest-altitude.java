class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int max=0;
        for(int g:gain){
            alt=alt+g;
            max=Math.max(alt,max);
        }
        return max;
    }
}