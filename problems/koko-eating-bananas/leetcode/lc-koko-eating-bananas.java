class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = -1;
        while(l <= r){
            int m = l + (r - l)/2;
            if(helper(piles, h, m)){
                ans = m;
                r = m-1;
            }
            else{
                l = m + 1;
            }
        }
        return ans;
    }
    boolean helper(int[] piles, int h, int m){
        long total = 0;
        for(int pile : piles){
            total += (pile + m -1)/m;
        }
        return total <= h;
    }
}