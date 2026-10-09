class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (hour <= dist.length - 1) {
            return -1;
        }
        int l = 1;
        int r = 10_000_000;
        int ans = Integer.MAX_VALUE;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (helper(dist, hour, m)) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        else
            return ans;
    }

    boolean helper(int[] dist, double hour, int s) {
        double total = 0;
        for (int i = 0; i < dist.length; i++) {
            if (i != dist.length - 1) {
                total += Math.ceil((double) dist[i] / s);
            } else {
                total += (double) dist[i] / s;
            }
        }
        return total <= hour;
    }
}