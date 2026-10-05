class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        int last = upperBound(nums, target);
        return new int[]{first, last};
    }
    public int lowerBound(int[] nums, int target){
        int ans = -1;
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = l + (r - l)/2;
            if(nums[m] == target){
                ans = m;
                r = m - 1;
            }
            else if(nums[m] < target){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return ans;
    }
    public int upperBound(int[] nums, int target){
        int ans = -1;
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = l + (r - l)/2;
            if(nums[m] == target){
                ans = m;
                l = m+1;
            }
            else if(nums[m] < target){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return ans;
    }
}