class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;

        for(int num : nums){
            if(num == element1){
                count1++;
            }else if(num == element2){
                count2++;
            }else if(count1 == 0){
                element1 = num;
                count1 = 1;
            }else if(count2 == 0){
                element2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == element1) count1++;
            else if(num == element2) count2++;
        }

        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        if(count1 > n/3) res.add(element1);
        if(count2 > n/3) res.add(element2);
        return res;
    }
}