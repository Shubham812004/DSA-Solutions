# Minimum Size Subarray Sum

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-minimum-size-subarray-sum` |
| Topics | Array, Binary Search, Sliding Window, Prefix Sum |
| Solved | 2026-11-13 |
| Runtime | 2 ms (beats 24.6593%) |
| Memory | 68.6 MB (beats 92.12890000000012%) |

## Problem Statement

Given an array of positive integers `nums` and a positive integer `target`, return _the **minimal length** of a __subarray__ whose sum is greater than or equal to_ `target`. If there is no such subarray, return `0` instead.

 

**Example 1:**

**Input:** target = 7, nums = [2,3,1,2,4,3]
**Output:** 2
**Explanation:** The subarray [4,3] has the minimal length under the problem constraint.

**Example 2:**

**Input:** target = 4, nums = [1,4,4]
**Output:** 1

**Example 3:**

**Input:** target = 11, nums = [1,1,1,1,1,1,1,1]
**Output:** 0

 

**Constraints:**

	- `1 <= target <= 109`

	- `1 <= nums.length <= 105`

	- `1 <= nums[i] <= 104`

 

**Follow up:** If you have figured out the `O(n)` solution, try coding another solution of which the time complexity is `O(n log(n))`.

## Solutions

```Java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;
        for(int r=0; r<nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                minLen = Math.min(minLen, r-l+1);
                sum -= nums[l];
                l++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }else{
            return minLen;
        }
    }
}
```
