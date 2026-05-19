class Solution {
    public boolean isHappy(int n){ 
    int sum=0;
    if(n==1){
        return true;
    }
    if(n==4){
        return false;
    }
        while(n!=1 && n!=4){
            sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit);
            n=n/10;
        }
        n=sum;
        }
        return sum==1;
    }
}