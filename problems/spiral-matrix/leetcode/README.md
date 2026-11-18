# Spiral Matrix

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-spiral-matrix` |
| Topics | Array, Matrix, Simulation |
| Solved | 2026-11-18 |
| Runtime | 0 ms (beats 100%) |
| Memory | 42.7 MB (beats 64.154%) |

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

## Solutions

```Java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n-1;
        int left = 0, right = m-1;

        List<Integer> res = new ArrayList<>();
        while(left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
```
