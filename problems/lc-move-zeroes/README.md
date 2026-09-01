# Move Zeroes

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-move-zeroes` |
| Topics | Array, Two Pointers |
| Solved | 2026-09-01 |
| Runtime | 2 ms (beats 91.5406%) |
| Memory | 47.8 MB (beats 56.77990000000005%) |

## Problem Statement

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.

 

**Example 1:**

**Input:** nums = [0,1,0,3,12]
**Output:** [1,3,12,0,0]
**Example 2:**

**Input:** nums = [0]
**Output:** [0]

 

**Constraints:**

	- `1 <= nums.length <= 104`

	- `-231 <= nums[i] <= 231 - 1`

 

**Follow up:** Could you minimize the total number of operations done?

## Solutions

```Java
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}
```
