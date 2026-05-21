class Solution {
    public String minRemoveToMakeValid(String s) {
        int head = 0;
        int tail = s.length() - 1;
        String res;
        char[] arr = s.toCharArray();        
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == '(')
                count++;
            else if (arr[i] == ')'){
                if (count == 0)
                    arr[i] = '*';
                else
                    count--;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--){
            if (count > 0 && arr[i] == '('){
                arr[i] = '*';
                count--;
            }
        }
        int p = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != '*'){
                arr[p++] = arr[i];
            }
        }
        res = new String(arr).substring(0, p);
        return res;
    }
}