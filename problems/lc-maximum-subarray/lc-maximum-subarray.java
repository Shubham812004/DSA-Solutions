class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int largestSum = nums[0];
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            largestSum = Math.max(sum, largestSum);
            if(sum < 0){
                sum = 0;
            }
        }
        return largestSum;
    }
}