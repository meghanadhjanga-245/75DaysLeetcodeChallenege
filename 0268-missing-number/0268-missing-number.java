class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s1=n*(n+1)/2;
        int s2=Arrays.stream(nums).sum();
        return s1-s2;
    }
}