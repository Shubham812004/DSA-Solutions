class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length) return -1;
        int l = Arrays.stream(nums).max().getAsInt();
        int h = 0;
        for(int num : nums){
            h += num;
        }
        int ans = -1;
        while(l <= h){
            int m = l + (h - l)/2;
            if(helper(nums, k, m)){
                ans = m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }

    public boolean helper(int[] nums, int k, int m){
        int count = 1;
        int sum = 0;
        for(int num : nums){
            if(sum + num <= m){
                sum += num;
            }
            else{
                count++;
                sum = num;
            }
        }
        return count <= k;
    }
}