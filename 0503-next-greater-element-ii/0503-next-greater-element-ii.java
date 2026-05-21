class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=2*n-2;i>=0;i--){
            while(!st.isEmpty() && nums[i%n]>=st.peek()) st.pop();
            if(i<n){
                res[i%n]=st.isEmpty() ? -1 :st.peek();
            }
            st.push(nums[i%n]);
        }
        return res;
            }
}