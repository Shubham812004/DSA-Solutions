# Container With Most Water

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-container-with-most-water` |
| Topics | Array, Two Pointers, Greedy |
| Solved | 2026-08-16 |
| Runtime | 5 ms (beats 83.18379999999999%) |
| Memory | 77.3 MB (beats 48.08060000000007%) |

## Problem Statement

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return _the maximum amount of water a container can store_.

**Notice** that you may not slant the container.

 

**Example 1:**

**Input:** height = [1,8,6,2,5,4,8,3,7]
**Output:** 49
**Explanation:** The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

**Example 2:**

**Input:** height = [1,1]
**Output:** 1

 

**Constraints:**

	- `n == height.length`

	- `2 <= n <= 105`

	- `0 <= height[i] <= 104`

## Solutions

```Java
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        while(l < r){
            int h = Math.min(height[l], height[r]);
            int w = r-l;
            int area = h * w;
            maxArea = Math.max(area, maxArea);
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}
```
