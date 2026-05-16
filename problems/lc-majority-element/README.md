# Majority Element

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-majority-element` |
| Topics | Array, Hash Table, Divide and Conquer, Sorting, Counting, Boyer–moore Majority Vote Algorithm |
| Solved | 2026-05-16 |
| Runtime | 1 ms (beats 99.8863%) |
| Memory | 55.6 MB (beats 68.7086%) |

## Problem Statement

Given an array `nums` of size `n`, return _the majority element_.

The majority element is the element that appears more than `&lfloor;n / 2&rfloor;` times. You may assume that the majority element always exists in the array.

 

**Example 1:**

**Input:** nums = [3,2,3]
**Output:** 3
**Example 2:**

**Input:** nums = [2,2,1,1,1,2,2]
**Output:** 2

 

**Constraints:**

	- `n == nums.length`

	- `1 <= n <= 5 * 104`

	- `-109 <= nums[i] <= 109`

	- The input is generated such that a majority element will exist in the array.

 

**Follow-up:** Could you solve the problem in linear time and in `O(1)` space?

## Solutions

```Java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                element = nums[i];
                count = 1;
            }else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}
```
