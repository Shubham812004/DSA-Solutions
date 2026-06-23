class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).min().getAsInt();
        int high = 0;
        for(int num : nums){
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(helper(nums, k, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    boolean helper(int[] nums, int k, int limit){
        int count = 1;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > limit) return false;
            if(sum + nums[i] > limit){
                count += 1;
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
        }
        if(count > k){
            return false;
        }
        else{
            return true;
        }
    }
}