# Search a 2D Matrix

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-search-a-2d-matrix` |
| Topics | Array, Binary Search, Matrix |
| Solved | 2026-07-07 |
| Runtime | 0 ms (beats 100%) |
| Memory | 44 MB (beats 23.995100000000022%) |

## Problem Statement

You are given an `m x n` integer matrix `matrix` with the following two properties:

	- Each row is sorted in non-decreasing order.

	- The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` _if_ `target` _is in_ `matrix` _or_ `false` _otherwise_.

You must write a solution in `O(log(m * n))` time complexity.

 

**Example 1:**

**Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
**Output:** true

**Example 2:**

**Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
**Output:** false

 

**Constraints:**

	- `m == matrix.length`

	- `n == matrix[i].length`

	- `1 <= m, n <= 100`

	- `-104 <= matrix[i][j], target <= 104`

## Solutions

```Java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        int low = 0;
        int high = m*n-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
```
