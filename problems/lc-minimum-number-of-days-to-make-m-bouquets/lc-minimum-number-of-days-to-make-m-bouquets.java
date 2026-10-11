class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int l = Integer.MAX_VALUE, h = Integer.MIN_VALUE;
        for(int bloom : bloomDay){
            l = Math.min(l, bloom);
            h = Math.max(h, bloom);
        }
        int ans = -1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(helper(bloomDay, m, k, mid)){
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    public boolean helper(int[] bloomDay, int m, int k, int day){
        int count = 0;
        int b = 0;
        for(int bloom : bloomDay){
            if(bloom <= day){
                count++;
                if(count == k){
                    b++;
                    count = 0;
                }
            }
            else{
                count = 0;
            }
        }
        return b >= m;
    }
}