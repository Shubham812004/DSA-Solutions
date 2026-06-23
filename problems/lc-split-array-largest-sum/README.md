# Split Array Largest Sum

| Field | Value |
|-------|-------|
| Difficulty | Hard |
| Platform | Leetcode |
| Problem ID | `lc-split-array-largest-sum` |
| Topics | Array, Binary Search, Dynamic Programming, Greedy, Prefix Sum |
| Solved | 2026-06-23 |
| Runtime | 2 ms (beats 34.9914%) |
| Memory | 42.9 MB (beats 83.32109999999999%) |

## Problem Statement

Given an integer array `nums` and an integer `k`, split `nums` into `k` non-empty subarrays such that the largest sum of any subarray is **minimized**.

Return _the minimized largest sum of the split_.

A **subarray** is a contiguous part of the array.

 

**Example 1:**

**Input:** nums = [7,2,5,10,8], k = 2
**Output:** 18
**Explanation:** There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

**Example 2:**

**Input:** nums = [1,2,3,4,5], k = 2
**Output:** 9
**Explanation:** There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

 

**Constraints:**

	- `1 <= nums.length <= 1000`

	- `0 <= nums[i] <= 106`

	- `1 <= k <= min(50, nums.length)`

## Solutions

```Java
class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).min().getAsInt();
        int high = 0;
        for(int num : nums){
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(helper(nums, k, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    boolean helper(int[] nums, int k, int limit){
        int count = 1;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > limit) return false;
            if(sum + nums[i] > limit){
                count += 1;
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
        }
        if(count > k){
            return false;
        }
        else{
            return true;
        }
    }
}
```
