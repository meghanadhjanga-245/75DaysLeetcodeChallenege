class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder sb=new StringBuilder();
        int c=0;
        while(i>=0 || j>=0 || c>0){
            int s=c;
            if(i>=0){
                s+=num1.charAt(i)-'0';
                i-=1;
            }
            if(j>=0){
                s+=(int)num2.charAt(j)-'0';
                j-=1;
            }
            c=Math.floorDiv(s,10);
            sb.append(s%10);
            c=s/10;
        }
        return sb.reverse().toString();
    }
}