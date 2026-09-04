# Maximum Average Subarray I

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Leetcode |
| Problem ID | `lc-maximum-average-subarray-i` |
| Topics | Array, Sliding Window |
| Solved | 2026-09-04 |
| Runtime | 3 ms (beats 75.3379%) |
| Memory | 69.8 MB (beats 25.559900000000074%) |

## Problem Statement

You are given an integer array `nums` consisting of `n` elements, and an integer `k`.

Find a contiguous subarray whose **length is equal to** `k` that has the maximum average value and return _this value_. Any answer with a calculation error less than `10-5` will be accepted.

 

**Example 1:**

**Input:** nums = [1,12,-5,-6,50,3], k = 4
**Output:** 12.75000
**Explanation:** Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

**Example 2:**

**Input:** nums = [5], k = 1
**Output:** 5.00000

 

**Constraints:**

	- `n == nums.length`

	- `1 <= k <= n <= 105`

	- `-104 <= nums[i] <= 104`

## Solutions

```Java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        maxSum = sum;
        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
}
```
