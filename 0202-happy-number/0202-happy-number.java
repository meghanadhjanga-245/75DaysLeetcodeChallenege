class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer> megha=new HashSet<>();
      if(n==1){
        return true;
      }  
      while(n!=1){
        if(megha.contains(n)){
            return false;
        }
        megha.add(n);
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        n=sum;
      }
      return true;
    }
}