# Move Zeroes

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-move-zeroes` |
| Topics | Array, Two Pointers |
| Solved | 2026-04-02 |
| Runtime | 2 ms (beats 91.5406%) |
| Memory | 47.8 MB (beats 37.76300000000005%) |

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
      int j =0;
      for(int i=0; i<nums.length; i++){
        if(nums[i] != 0){
            nums[j] = nums[i];
            j++;
        }
      }
      while(j < nums.length){
        nums[j] = 0;
        j++;
      }  
    }
}
```
