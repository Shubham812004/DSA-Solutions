class Solution {
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        if(m*k > arr.length) return -1;
        
        int l = Integer.MAX_VALUE, h =Integer.MAX_VALUE;
        for(int bloom : arr){
            l = Math.min(l, bloom);
            h = Math.max(h, bloom);
        }
        int ans = -1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(helper(arr, k, m, mid)){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
    
    public boolean helper(int[] arr, int k, int m, int day){
        int count = 0, b = 0;
        for(int bloom : arr){
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