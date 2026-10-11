# Binary Search

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-binary-search-1587115620` |
| Topics | Array, Searching, Divide and Conquer |

## Problem Statement

Given a sorted array **arr[]** and an integer **k**, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return **-1**. 

**Note:** If multiple occurrences are there, please return the smallest index.

**Examples:**

**Input: **arr[] = [1, 2, 3, 4, 5], k = 4
**Output:** 3
**Explanation:** 4 appears at index 3.
**Input: **arr[] = [11, 22, 33, 44, 55], k = 445
**Output:** -1
**Explanation:** 445 is not present.

**Input: **arr[] = [1, 1, 1, 1, 2], k = 1
**Output:** 0
**Explanation:** 1 appears at index 0.
**Constraints:
**1 &le; arr.size() &le; 105
1 &le; arr[i] &le; 106
1 &le; k &le; 106
