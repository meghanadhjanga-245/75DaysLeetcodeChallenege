class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        String k=Integer.toBinaryString(n);
        if(k.charAt(0)!='1'){
            return false;
        }
        for(int i=1;i<k.length();i++){
            if(k.charAt(i)!='0'){
                return false;
            }
        }
        return true;
    }
}