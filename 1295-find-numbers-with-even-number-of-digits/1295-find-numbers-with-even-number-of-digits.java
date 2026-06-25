class Solution {
    public int findNumbers(int[] nums) {
        int megha=0;
        int n=nums.length;
        for(int num:nums){
            int count=0;
            int temp=Math.abs(num);
            if(temp==0){
                count=1;
            }
            else{
                while(temp>0){
                    temp/=10;
                    count+=1;
                }
            }
            if(count%2==0){
                megha++;
            }
        }
        return megha;
    }
}