# House Robber II

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-house-robber-ii` |
| Topics | Dynamic Programming, Array |
| Solved | 2026-05-22 |
| Runtime | 0 ms (beats 100%) |
| Memory | 42.8 MB (beats 41.29309999999997%) |

## Problem Statement

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are **arranged in a circle.** That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and **it will automatically contact the police if two adjacent houses were broken into on the same night**.

Given an integer array `nums` representing the amount of money of each house, return _the maximum amount of money you can rob tonight **without alerting the police**_.

 

**Example 1:**

**Input:** nums = [2,3,2]
**Output:** 3
**Explanation:** You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

**Example 2:**

**Input:** nums = [1,2,3,1]
**Output:** 4
**Explanation:** Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

**Example 3:**

**Input:** nums = [1,2,3]
**Output:** 3

 

**Constraints:**

	- `1 <= nums.length <= 100`

	- `0 <= nums[i] <= 1000`

## Hints

<details>
<summary>Hint 1</summary>

Since House[1] and House[n] are adjacent, they cannot be robbed together. Therefore, the problem becomes to rob either House[1]-House[n-1] or House[2]-House[n], depending on which choice offers more money. Now the problem has degenerated to the House Robber, which is already been solved.

</details>

## Solutions

```Java
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int res1 = robHelper(nums, 0, n-2);
        int res2 = robHelper(nums, 1, n-1);
        return Math.max(res1, res2);
    }
    public int robHelper(int[] nums, int start, int end){
        int first = nums[start];
        int second = Math.max(first, nums[start+1]);
        for(int i=start+2; i<=end; i++){
            int third = nums[i] + first;
            third = Math.max(third, second);
            first = second;
            second = third;
        }
        return second;
    }
}
```
