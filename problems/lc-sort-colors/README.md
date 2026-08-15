# Sort Colors

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-sort-colors` |
| Topics | Array, Two Pointers, Sorting, Quicksort, Bubble Sort |
| Solved | 2026-08-15 |
| Runtime | 0 ms (beats 100%) |
| Memory | 43.4 MB (beats 31.4867%) |

## Problem Statement

You are given an array `nums` with `n` objects colored red, white, or blue, sort them **in-place **so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

**Example 1:**

**Input:** nums = [2,0,2,1,1,0]

**Output:** [0,0,1,1,2,2]

**Explanation:**

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

**Example 2:**

**Input:** nums = [2,0,1]

**Output:** [0,1,2]

**Explanation:**

The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

 

**Constraints:**

	- `n == nums.length`

	- `1 <= n <= 300`

	- `nums[i]` is either 0, 1, or 2.

 

**Follow up:** Could you come up with a one-pass algorithm using only constant extra space?

## Solutions

```Java
class Solution {
    public void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    public void sortColors(int[] nums) {
        int l = 0;
        int mid = 0;
        int r = nums.length-1;
        while(mid <= r){
            if(nums[mid] == 0){
                swap(nums, l, mid);
                l++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, r);
                r--;
            }
        }
    }
}
```
