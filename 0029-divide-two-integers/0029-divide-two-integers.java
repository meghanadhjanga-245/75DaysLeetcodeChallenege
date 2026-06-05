class Solution {
    public int divide(int dividend, int divisor) {
        int s;
        if(dividend==-2147483648 && divisor==1){
            return -2147483648;
        }
        if((dividend>0 && divisor>0)|| (dividend<0 && divisor<0)){
            s=1;
        }else{
            s=-1;
        }
        int result=s*(int)Math.abs(Math.floor(dividend/divisor));
        if(result>Math.pow(2,31)-1){
            return (int)Math.pow(2,31)-1;
        }
        else if(result<-Math.pow(2,31)+1){
            return (int)-Math.pow(2,31)+1;
        }
        return result;
    }
}