# Median of Two Sorted Arrays

| Field | Value |
|-------|-------|
| Difficulty | Hard |
| Platform | Leetcode |
| Problem ID | `lc-median-of-two-sorted-arrays` |
| Topics | Array, Binary Search, Divide and Conquer |
| Solved | 2025-10-21 |
| Runtime | 4 ms (beats 44.8253%) |
| Memory | 12.6 MB (beats 15.515800000000013%) |

## Problem Statement

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return **the median** of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

**Example 1:**

**Input:** nums1 = [1,3], nums2 = [2]
**Output:** 2.00000
**Explanation:** merged array = [1,2,3] and median is 2.

**Example 2:**

**Input:** nums1 = [1,2], nums2 = [3,4]
**Output:** 2.50000
**Explanation:** merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 

**Constraints:**

	- `nums1.length == m`

	- `nums2.length == n`

	- `0 <= m <= 1000`

	- `0 <= n <= 1000`

	- `1 <= m + n <= 2000`

	- `-106 <= nums1[i], nums2[i] <= 106`

## Solutions

```Python
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        num = sorted(nums1 + nums2)
        lenght = len(num)
        mid = lenght//2
        return float(num[mid]
        if lenght % 2
        else (num[mid-1] + num[mid])/2.0)
```
