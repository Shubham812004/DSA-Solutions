# Find First and Last Position of Element in Sorted Array

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-find-first-and-last-position-of-element-in-sorted-array` |
| Topics | Array, Binary Search |
| Solved | 2026-10-05 |
| Runtime | 0 ms (beats 100%) |
| Memory | 48.1 MB (beats 50.88440000000005%) |

## Problem Statement

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

**Example 1:**

**Input:** nums = [5,7,7,8,8,10], target = 8
**Output:** [3,4]
**Example 2:**

**Input:** nums = [5,7,7,8,8,10], target = 6
**Output:** [-1,-1]
**Example 3:**

**Input:** nums = [], target = 0
**Output:** [-1,-1]

 

**Constraints:**

	- `0 <= nums.length <= 105`

	- `-109 <= nums[i] <= 109`

	- `nums` is a non-decreasing array.

	- `-109 <= target <= 109`

## Solutions

```Java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        int last = upperBound(nums, target);
        return new int[]{first, last};
    }
    public int lowerBound(int[] nums, int target){
        int ans = -1;
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = l + (r - l)/2;
            if(nums[m] == target){
                ans = m;
                r = m - 1;
            }
            else if(nums[m] < target){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return ans;
    }
    public int upperBound(int[] nums, int target){
        int ans = -1;
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = l + (r - l)/2;
            if(nums[m] == target){
                ans = m;
                l = m+1;
            }
            else if(nums[m] < target){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return ans;
    }
}
```
