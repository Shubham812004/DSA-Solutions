class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                arr.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int n = nums.length;
        int sum = 0;
        int expectedSum = n*(n+1)/2;
        for(int x : set){
            sum += x;
        }
        int num = expectedSum - sum;
        arr.add(num);
        int[] res = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i] = arr.get(i); 
        }
        return res;
    }
}