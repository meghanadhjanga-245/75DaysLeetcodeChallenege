class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> megha=new HashSet<>();
        for(int num:nums){
            megha.add(num);
        }
        int cur=k;
        while(megha.contains(cur)){
            cur+=k;
        }
        return cur;
    }
}