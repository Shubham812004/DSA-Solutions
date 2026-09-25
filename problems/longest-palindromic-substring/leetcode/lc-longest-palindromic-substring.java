class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(s, i, j)){
                    if(j-i+1 > result.length())
                        result = s.substring(i, j+1);
                }
            }
        }
        return result;
    }
    public boolean isPalindrome(String s, int l, int r){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}