class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        int max=0;
        int maxco=0;
        
        for(char c:s.toCharArray()){
            int i=c-'a';
            freq[i]++;
            if(c=='a' || c== 'e' || c=='i' || c=='o' || c=='u'){
                max=Math.max(max,freq[i]);
            }
            else{
                maxco=Math.max(maxco,freq[i]);
            }
        }
        return max+maxco;
    }
}