# Find the Duplicate Number

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-find-the-duplicate-number` |
| Topics | Array, Two Pointers, Binary Search, Bit Manipulation, Pigeonhole Principle, Floyd's Cycle Finding Algorithm |
| Solved | 2026-11-18 |
| Runtime | 5 ms (beats 66.20370000000001%) |
| Memory | 82.5 MB (beats 68.54710000000004%) |

## Problem Statement

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return _this repeated number_.

You must solve the problem **without** modifying the array `nums` and using only constant extra space.

 

**Example 1:**

**Input:** nums = [1,3,4,2,2]
**Output:** 2

**Example 2:**

**Input:** nums = [3,1,3,4,2]
**Output:** 3

**Example 3:**

**Input:** nums = [3,3,3,3,3]
**Output:** 3

 

**Constraints:**

	- `1 <= n <= 105`

	- `nums.length == n + 1`

	- `1 <= nums[i] <= n`

	- All the integers in `nums` appear only **once** except for **precisely one integer** which appears **two or more** times.

 

**Follow up:**

	- How can we prove that at least one duplicate number must exist in `nums`?

	- Can you solve the problem in linear runtime complexity?

## Solutions

```Java
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        fast = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
```
