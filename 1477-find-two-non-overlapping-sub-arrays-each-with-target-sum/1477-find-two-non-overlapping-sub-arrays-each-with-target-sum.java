class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] best = new int[n];
        int INF = 1_000_000_00 + 1;
        Arrays.fill(best,INF);
        int left = 0;
        int sum = 0;
        int ans = INF;
        for(int right = 0;right<n;right++){
            sum += arr[right];
            while(sum > target && left<=right){
                sum -= arr[left];
                left++;
            }
            if(sum==target){
                if(left>0 && best[left-1]!=INF){
                    ans = Math.min(ans,right-left+1 + best[left-1]);
                }
                best[right] = right-left+1;
            }
            if(right>0)
            best[right] = Math.min(best[right],best[right-1]);
        }
        if(ans==INF){
            return -1;
        }
        return ans;
    }
}