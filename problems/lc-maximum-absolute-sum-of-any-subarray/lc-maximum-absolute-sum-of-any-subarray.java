class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int num : nums){
            sum1 += num;
            sum2 += num;
            maxSum = Math.max(maxSum, sum1);
            minSum = Math.min(minSum, sum2);
            if(sum1 < 0) sum1 = 0;
            if(sum2 > 0) sum2 = 0;
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}