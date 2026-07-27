class Solution {
    public int maxProduct(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int x=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
             x=(nums[i]-1)*(nums[j]-1);
        }
       }
       return x;
    }
}