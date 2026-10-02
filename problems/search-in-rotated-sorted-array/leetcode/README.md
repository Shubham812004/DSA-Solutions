# Search in Rotated Sorted Array

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-search-in-rotated-sorted-array` |
| Topics | Array, Binary Search |
| Solved | 2026-10-02 |
| Runtime | 0 ms (beats 100%) |
| Memory | 43.9 MB (beats 47.25879999999998%) |

## Problem Statement

There is an integer array `nums` sorted in ascending order (with **distinct** values).

Prior to being passed to your function, `nums` is **possibly left rotated** at an unknown index `k` (`1 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,5,6,7]` might be left rotated by `3` indices and become `[4,5,6,7,0,1,2]`.

Given the array `nums` **after** the possible rotation and an integer `target`, return _the index of _`target`_ if it is in _`nums`_, or _`-1`_ if it is not in _`nums`.

You must write an algorithm with `O(log n)` runtime complexity.

 

**Example 1:**

**Input:** nums = [4,5,6,7,0,1,2], target = 0
**Output:** 4
**Example 2:**

**Input:** nums = [4,5,6,7,0,1,2], target = 3
**Output:** -1
**Example 3:**

**Input:** nums = [1], target = 0
**Output:** -1

 

**Constraints:**

	- `1 <= nums.length <= 5000`

	- `-104 <= nums[i] <= 104`

	- All values of `nums` are **unique**.

	- `nums` is an ascending array that is possibly rotated.

	- `-104 <= target <= 104`

## Solutions

```Java
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            int m = l+(r-l)/2;
            if(nums[m] == target) return m;
            if(nums[l] <= nums[m]){
                if(nums[l] <= target && target <= nums[m]){
                    r = m-1;
                }
                else{
                    l = m+1;
                }
            }
            if(nums[m] <= nums[r]){
                if(nums[m] <= target && target <= nums[r]){
                    l = m+1;
                }
                else{
                    r = m-1;
                }
            }
        }
        return -1;
    }
}
```
