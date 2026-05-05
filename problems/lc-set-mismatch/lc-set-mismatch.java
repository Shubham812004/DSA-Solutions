class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0;
        for(int num : nums){
            if(set.contains(num)){
                duplicate = num;
            }
            set.add(num);
        }
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actaulSum = 0;
        for(int num: set){
            actaulSum += num;
        }
        int missing = expectedSum - actaulSum;
        return new int[]{duplicate, missing};
    }
}