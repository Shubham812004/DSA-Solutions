# Find Peak Element

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-find-peak-element` |
| Topics | Array, Binary Search |
| Solved | 2026-10-04 |
| Runtime | 0 ms (beats 100%) |
| Memory | 44.6 MB (beats 6.5178999999999565%) |

## Problem Statement

A peak element is an element that is strictly greater than its neighbors.

Given a **0-indexed** integer array `nums`, find a peak element, and return its index. If the array contains multiple peaks, return the index to **any of the peaks**.

You may imagine that `nums[-1] = nums[n] = -&infin;`. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in `O(log n)` time.

 

**Example 1:**

**Input:** nums = [1,2,3,1]
**Output:** 2
**Explanation:** 3 is a peak element and your function should return the index number 2.

**Example 2:**

**Input:** nums = [1,2,1,3,5,6,4]
**Output:** 5
**Explanation:** Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

 

**Constraints:**

	- `1 <= nums.length <= 1000`

	- `-231 <= nums[i] <= 231 - 1`

	- `nums[i] != nums[i + 1]` for all valid `i`.

## Solutions

```Java
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(n == 2){
            if(nums[0] > nums[1]) return 0;
            else return 1;
        }
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        int l = 1;
        int r = n-2;
        while(l <= r){
            int m = l + (r - l)/2;
            if(nums[m] > nums[m-1] && nums[m] > nums[m+1]){
                return m;
            }
            else if(nums[m] < nums[m+1]){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return -1;
    }
}
```
