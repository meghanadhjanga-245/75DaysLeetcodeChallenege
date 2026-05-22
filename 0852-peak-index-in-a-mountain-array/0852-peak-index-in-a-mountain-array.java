class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int i=1;
      int n=arr.length;
      while(i<n){
        if(arr[i-1]>arr[i]){
            break;
        }
        i++;
      }
      return i - 1;
    }
}