class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int len = 0;
        for(int i=0; i<s.length(); i++){
            int odd = isPalindrome(s, i, i);
            int even = isPalindrome(s, i, i+1);
            len = Math.max(odd, even);

            if(len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }
    int isPalindrome(String s, int l, int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}