# Subarray Sum Equals K

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-subarray-sum-equals-k` |
| Topics | Array, Hash Table, Prefix Sum |
| Solved | 2026-11-05 |
| Runtime | 24 ms (beats 81.09369999999998%) |
| Memory | 48.5 MB (beats 58.86909999999997%) |

## Problem Statement

Given an array of integers `nums` and an integer `k`, return _the total number of subarrays whose sum equals to_ `k`.

A subarray is a contiguous **non-empty** sequence of elements within an array.

 

**Example 1:**

**Input:** nums = [1,1,1], k = 2
**Output:** 2
**Example 2:**

**Input:** nums = [1,2,3], k = 3
**Output:** 2

 

**Constraints:**

	- `1 <= nums.length <= 2 * 104`

	- `-1000 <= nums[i] <= 1000`

	- `-107 <= k <= 107`

## Solutions

```Java
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for(int num : nums){
            sum += num;
            if(map.containsKey(sum - k)) count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
```
