class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = 1;
        }
        int preProd = 1;
        for(int i=0; i<n; i++){
            res[i] = preProd;
            preProd *= nums[i];
        }
        int sufProd = 1;
        for(int i=n-1; i>=0; i--){
            res[i] *= sufProd;
            sufProd *= nums[i];
        }
        return res;
    }
}