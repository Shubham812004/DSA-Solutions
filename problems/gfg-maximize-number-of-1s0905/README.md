# Maximize Number Of 1s0905

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-maximize-number-of-1s0905` |
| Topics | Array, Binary Search, Sliding Window, Two Pointers |

## Problem Statement

Given a binary array **arr[]** containing only 0s and 1s and an integer **k**, you are allowed to flip at most **k** 0s to 1s. Find the maximum number of consecutive **1's** that can be obtained in the array after performing the operation at most **k** times.

**Examples:**

**Input: **arr[] = [1, 0, 1], k = 1
**Output: **3
**Explanation: **By flipping the zero at index 1, we get the longest subarray from index 0 to 2 containing all 1&rsquo;s.
**Input: **arr[] = [1, 0, 0, 1, 0, 1, 0, 1], k = 2
**Output: **5
**Explanation: **By flipping the zeroes at indices 4 and 6, we get the longest subarray from index 3 to 7 containing all 1&rsquo;s.

**Input: **arr[] = [1, 1], k = 2
**Output: **2
**Explanation: **Since the array is already having the max consecutive 1's, hence we dont need to perform any operation. Hence the answer is 2.
**Constraints:**
1 &le; arr.size() &le; 105
0 &le; k &le; arr.size()
0 &le; arr[i] &le; 1
