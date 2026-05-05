class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = 0;
        if(nums.length <= 1 && nums[0] < 0){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                maxProd = Math.max(prod, maxProd);
            }
        }
        return maxProd;
    }
}