class Solution {
    public void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = n-1; 
        while(l <= r){
            swap(nums, l, r);
            l++;
            r--;
        }
        k = k % n;
        int i=0;
        int j = k-1;
        while(i <= j){
            swap(nums, i, j);
            i++;
            j--;
        }
        l = k;
        r = n-1;
        while(l <= r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}