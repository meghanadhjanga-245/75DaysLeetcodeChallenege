class Solution {
    public int findLucky(int[] arr) {
       int n=arr.length;
       int re=-1;
       for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count==arr[i]){
            re=Math.max(re,arr[i]);
        }
       } 
       return re;
    }
}