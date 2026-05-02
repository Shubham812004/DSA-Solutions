# Set Mismatch

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-set-mismatch` |
| Topics | Array, Hash Table, Bit Manipulation, Sorting |
| Solved | 2026-05-02 |
| Runtime | 22 ms (beats 12.59129999999998%) |
| Memory | 48.2 MB (beats 8.509099999999986%) |

## Problem Statement

You have a set of integers `s`, which originally contains all the numbers from `1` to `n`. Unfortunately, due to some error, one of the numbers in `s` got duplicated to another number in the set, which results in **repetition of one** number and **loss of another** number.

You are given an integer array `nums` representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return _them in the form of an array_.

 

**Example 1:**

**Input:** nums = [1,2,2,4]
**Output:** [2,3]
**Example 2:**

**Input:** nums = [1,1]
**Output:** [1,2]

 

**Constraints:**

	- `2 <= nums.length <= 104`

	- `1 <= nums[i] <= 104`

## Solutions

```Java
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
```
