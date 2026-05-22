class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int res1 = robHelper(nums, 0, n-2);
        int res2 = robHelper(nums, 1, n-1);
        return Math.max(res1, res2);
    }
    public int robHelper(int[] nums, int start, int end){
        int first = nums[start];
        int second = Math.max(first, nums[start+1]);
        for(int i=start+2; i<=end; i++){
            int third = nums[i] + first;
            third = Math.max(third, second);
            first = second;
            second = third;
        }
        return second;
    }
}