# Maximum Subarray

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-maximum-subarray` |
| Topics | Array, Divide and Conquer, Dynamic Programming |
| Solved | 2026-05-02 |
| Runtime | 1 ms (beats 99.9298%) |
| Memory | 77.1 MB (beats 82.29399999999995%) |

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

```Java
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int largestSum = nums[0];
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            largestSum = Math.max(sum, largestSum);
            if(sum < 0){
                sum = 0;
            }
        }
        return largestSum;
    }
}
```
