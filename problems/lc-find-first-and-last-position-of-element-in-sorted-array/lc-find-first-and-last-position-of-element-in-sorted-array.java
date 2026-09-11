class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = findFirst(nums, target);
        int lastPos = findLast(nums, target);
        return new int[]{firstPos, lastPos};
    }
    public int findFirst(int[] nums, int target){
        int ans = -1;
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = (l + r)/2;
            if(nums[m] == target){
                ans = m;
                r = m - 1;
            }
            else if(nums[m] < target){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return ans;
    }

    public int findLast(int[] nums, int target){
        int ans = -1;
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = (l + r)/2;
            if(nums[m] == target){
                ans = m;
                l = m + 1;
            }
            else if(nums[m] < target){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return ans;
    }
}