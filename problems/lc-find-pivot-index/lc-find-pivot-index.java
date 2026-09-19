class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums){
            total += num;
        }
        int leftMost = 0;
        for(int i=0; i<nums.length; i++){
            leftMost += nums[i];
            int rightMost = total - leftMost;
            if((leftMost - nums[i]) == rightMost)
                return i;
        }
        return -1;
    }
}