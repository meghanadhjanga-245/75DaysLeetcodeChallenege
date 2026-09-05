class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        int globmax=Integer.MIN_VALUE;
        int ansmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            globmax=Math.max(globmax,nums[i]);
            if(i==ans){
                ansmax=Math.max(ansmax,nums[i]);
            }
            if(nums[i]<ansmax-k){
                ans=i+1;
                ansmax=globmax;
            }
        }
        return ans<n?ans:-1;
    }
}