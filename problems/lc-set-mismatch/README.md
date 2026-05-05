# Set Mismatch

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-set-mismatch` |
| Topics | Array, Hash Table, Bit Manipulation, Sorting |
| Solved | 2026-05-05 |
| Runtime | 15 ms (beats 26.47439999999998%) |
| Memory | 47.5 MB (beats 76.35299999999998%) |

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
```
