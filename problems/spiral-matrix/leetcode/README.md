# Spiral Matrix

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-spiral-matrix` |
| Topics | Array, Matrix, Simulation |
| Solved | 2026-04-14 |
| Runtime | 0 ms (beats 100%) |
| Memory | 42.8 MB (beats 89.62899999999998%) |

## Problem Statement

Given an `m x n` `matrix`, return _all elements of the_ `matrix` _in spiral order_.

 

**Example 1:**

**Input:** matrix = [[1,2,3],[4,5,6],[7,8,9]]
**Output:** [1,2,3,6,9,8,7,4,5]

**Example 2:**

**Input:** matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
**Output:** [1,2,3,4,8,12,11,10,9,5,6,7]

 

**Constraints:**

	- `m == matrix.length`

	- `n == matrix[i].length`

	- `1 <= m, n <= 10`

	- `-100 <= matrix[i][j] <= 100`

## Hints

<details>
<summary>Hint 1</summary>

Well for some problems, the best way really is to come up with some algorithms for simulation. Basically, you need to simulate what the problem asks us to do.

</details>

<details>
<summary>Hint 2</summary>

We go boundary by boundary and move inwards. That is the essential operation. First row, last column, last row, first column, and then we move inwards by 1 and repeat. That's all. That is all the simulation that we need.

</details>

<details>
<summary>Hint 3</summary>

Think about when you want to switch the progress on one of the indexes. If you progress on i out of [i, j], you'll shift in the same column. Similarly, by changing values for j, you'd be shifting in the same row.
Also, keep track of the end of a boundary so that you can move inwards and then keep repeating. It's always best to simulate edge cases like a single column or a single row to see if anything breaks or not.

</details>

## Solutions

```Java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        List<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
```
