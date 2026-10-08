class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int r = 0;
        for(int num : weights){
            r += num;
        }
        int ans = Integer.MAX_VALUE;
        while(l <= r){
            int m = l + (r - l)/2;
            boolean minCap = minimumWeight(weights, days, m);
            if(minCap){
                ans = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }

    public boolean minimumWeight(int[] weights, int days, int minCap){
        int count = 1;
        int cap = 0;
        for(int i=0; i<weights.length; i++){
            if((cap + weights[i]) > minCap){
                count++;
                cap = weights[i];
            }
            else{
                cap += weights[i];
            }
        }
        return count <= days;
    }
}