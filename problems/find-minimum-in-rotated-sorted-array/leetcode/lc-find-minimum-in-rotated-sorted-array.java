class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int minValue = Integer.MAX_VALUE;
        while(l <= r){
            int m = l + (r - l)/2;
            if(nums[m] < minValue){
                minValue = nums[m];
            }
            if(nums[m] > nums[r]){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return minValue;
    }
}