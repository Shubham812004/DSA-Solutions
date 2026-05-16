# Container With Most Water

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-container-with-most-water` |
| Topics | Array, Two Pointers, Greedy |
| Solved | 2026-05-16 |
| Runtime | 5 ms (beats 82.38489999999999%) |
| Memory | 77.3 MB (beats 68.56489999999987%) |

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

## Hints

<details>
<summary>Hint 1</summary>

If you simulate the problem, it will be O(n^2) which is not efficient.

</details>

<details>
<summary>Hint 2</summary>

Try to use two-pointers. Set one pointer to the left and one to the right of the array. Always move the pointer that points to the lower line.

</details>

<details>
<summary>Hint 3</summary>

How can you calculate the amount of water at each step?

</details>

## Solutions

```Java
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea= 0;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h*w;
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
```
