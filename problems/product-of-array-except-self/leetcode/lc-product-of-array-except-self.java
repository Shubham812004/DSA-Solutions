class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for(int i=0; i<n; i++){
            prefix[i] = 1;
            suffix[i] = 1;
        }
        int preProd = 1;
        for(int i=0; i<n; i++){
            prefix[i] = preProd;
            preProd *= nums[i];
        }
        int sufProd = 1;
        for(int i=n-1; i >= 0; i--){
            suffix[i] = sufProd;
            sufProd *= nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i] = prefix[i] * suffix[i];
        }
        return nums;
    }
}