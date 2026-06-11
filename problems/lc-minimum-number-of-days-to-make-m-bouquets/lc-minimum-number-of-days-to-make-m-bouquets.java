class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int day : bloomDay){
            low = Math.min(day, low);
            high = Math.max(day, high);
        }
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(helper(bloomDay, mid, m, k)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    boolean helper(int[] bloomDay, int day, int m, int k){
        int count = 0;
        int noOfB = 0;
        for(int bloom : bloomDay){
            if(bloom <= day){
                count++;
            }
            else{
                noOfB += count / k;
                count = 0;
            }
        }
        noOfB += count/k;
        return noOfB >= m;
    }
}