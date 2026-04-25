class Solution {
    public boolean validDigit(int n, int x) {
        String str = String.valueOf(n); 
        char X = (char)(x + '0');

        if(str.charAt(0) == X){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == X){
                return true;
            }
        }
        return false;
    }
}