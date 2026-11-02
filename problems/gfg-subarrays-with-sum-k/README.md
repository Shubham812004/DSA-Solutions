# Subarrays With Sum K

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-subarrays-with-sum-k` |
| Topics | Hash Table |

## Problem Statement

Given an unsorted array **arr[]** of integers, find the number of subarrays whose sum exactly equal to a given number k.

**Examples:**

**Input:**** **arr[] = [10, 2, -2, -20, 10], k = -10
**Output:** 3
**Explanation:** Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.
**Input:** arr[] = [9, 4, 20, 3, 10, 5], k = 33
**Output:** 2
**Explanation:** Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33.

**Input: **arr[] = [1, 3, 5], k = 0
**Output:** 0
**Explanation: **No subarray with 0 sum.
**Constraints:
**1 &le; arr.size() &le; 105
-103 &le; arr[i] &le; 103
-105 &le; k &le; 105
