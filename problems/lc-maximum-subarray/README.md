# Maximum Subarray

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-maximum-subarray` |
| Topics | Array, Divide and Conquer, Dynamic Programming |
| Solved | 2025-10-28 |
| Runtime | 26 ms (beats 96.6746%) |
| Memory | 22.1 MB (beats 5.272000000000023%) |

## Problem Statement

Given an integer array `nums`, find the subarray with the largest sum, and return _its sum_.

 

**Example 1:**

**Input:** nums = [-2,1,-3,4,-1,2,1,-5,4]
**Output:** 6
**Explanation:** The subarray [4,-1,2,1] has the largest sum 6.

**Example 2:**

**Input:** nums = [1]
**Output:** 1
**Explanation:** The subarray [1] has the largest sum 1.

**Example 3:**

**Input:** nums = [5,4,-1,7,8]
**Output:** 23
**Explanation:** The subarray [5,4,-1,7,8] has the largest sum 23.

 

**Constraints:**

	- `1 <= nums.length <= 105`

	- `-104 <= nums[i] <= 104`

 

**Follow up:** If you have figured out the `O(n)` solution, try coding another solution using the **divide and conquer** approach, which is more subtle.

## Solutions

```Python
class Solution(object):
    def maxSubArray(self, nums):
        max_sum = nums[0]
        curr_sum = 0

        for num in nums:
            curr_sum += num
            if curr_sum > max_sum:
                max_sum = curr_sum
            if curr_sum < 0:
                curr_sum = 0
        return max_sum
        """
        :type nums: List[int]
        :rtype: int
        """
        
```
