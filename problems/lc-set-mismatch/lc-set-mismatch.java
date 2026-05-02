class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        for(int num: nums){
            if(set.contains(num)){
                duplicate = num;
            }
            set.add(num);
        }
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int sum = 0;
        for(int num : set){
            sum += num;
        }
        int missing = expectedSum - sum;
        return new int[]{duplicate, missing};
    }
}