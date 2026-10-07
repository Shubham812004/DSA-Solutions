class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = -1;
        while(l <= r){
            int m = l + (r - l)/2;
            long minHour = timeTaken(piles, m);
            if(minHour <= h){
                ans = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }

    public long timeTaken(int[] piles, int m){
        long total = 0;
        for(int num : piles){
            total += (num + m -1)/m;
        }
        return total;
    }
}