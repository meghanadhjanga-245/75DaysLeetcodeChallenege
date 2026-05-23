class Solution {
    private boolean issquare(int x){
        int r=(int) Math.sqrt(x);
        return r*r==x;
    }
    public int numSquares(int n) {
        if(issquare(n)) return 1;
        while(n%4==0){
            n/=4;
        }
        if(n%8==7){
            return 4;
        }
        for(int i=1;i*i<=n;i++){
            if(issquare(n-i*i)){
                return 2;
            }
        }
        return 3;
    }
}