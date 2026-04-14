# Subarray Sum Equals K

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-subarray-sum-equals-k` |
| Topics | Array, Hash Table, Prefix Sum |
| Solved | 2026-04-14 |
| Runtime | 1536 ms (beats 19.039700000000167%) |
| Memory | 48.3 MB (beats 96.39050000000003%) |

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

## Hints

<details>
<summary>Hint 1</summary>

Will Brute force work here? Try to optimize it.

</details>

<details>
<summary>Hint 2</summary>

Can we optimize it by using some extra space?

</details>

<details>
<summary>Hint 3</summary>

What about storing sum frequencies in a hash table? Will it be useful?

</details>

<details>
<summary>Hint 4</summary>

sum(i,j)=sum(0,j)-sum(0,i), where sum(i,j) represents the sum of all the elements from index i to j-1.

Can we use this property to optimize it.

</details>

## Solutions

```Java
class Solution {
    public int subarraySum(int[] nums, int k) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    length++;
                }
            }
        }
        return length;
    }
}
```
