class Solution {
    public int minElement(int[] nums) {
        int min=20000;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                sum=sum+nums[i]%10;
                nums[i]=(int)nums[i]/10;
            }
            min=Math.min(sum,min);
        }
        return min;
    }
}