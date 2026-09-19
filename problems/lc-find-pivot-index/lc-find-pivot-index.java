class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int rightMost = total - sum;
            int leftMost = sum - nums[i];
            if(leftMost == rightMost) return i;
        }
        return -1;
    }
}