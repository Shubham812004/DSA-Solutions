# Split Array Largest Sum

| Field | Value |
|-------|-------|
| Difficulty | Hard |
| Platform | Leetcode |
| Problem ID | `lc-split-array-largest-sum` |
| Topics | Array, Binary Search, Dynamic Programming, Greedy, Prefix Sum |
| Solved | 2026-10-14 |
| Runtime | 2 ms (beats 35.305800000000005%) |
| Memory | 42.3 MB (beats 99.3821%) |

## Problem Statement

Given an integer array `nums` and an integer `k`, split `nums` into `k` non-empty subarrays such that the largest sum of any subarray is **minimized**.

Return _the minimized largest sum of the split_.

A **subarray** is a contiguous part of the array.

 

**Example 1:**

**Input:** nums = [7,2,5,10,8], k = 2
**Output:** 18
**Explanation:** There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

**Example 2:**

**Input:** nums = [1,2,3,4,5], k = 2
**Output:** 9
**Explanation:** There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

 

**Constraints:**

	- `1 <= nums.length <= 1000`

	- `0 <= nums[i] <= 106`

	- `1 <= k <= min(50, nums.length)`

## Solutions

```Java
class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length) return -1;
        int l = Arrays.stream(nums).max().getAsInt();
        int h = 0;
        for(int num : nums){
            h += num;
        }
        int ans = -1;
        while(l <= h){
            int m = l + (h - l)/2;
            if(helper(nums, k, m)){
                ans = m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return ans;
    }

    public boolean helper(int[] nums, int k, int m){
        int count = 1;
        int sum = 0;
        for(int num : nums){
            if(sum + num <= m){
                sum += num;
            }
            else{
                count++;
                sum = num;
            }
        }
        return count <= k;
    }
}
```
