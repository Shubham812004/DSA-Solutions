# Search in Sorted Matrix

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-search-in-a-matrix-1587115621` |
| Topics | Searching, Matrix |
| Solved | 2026-10-21 |
| Solve Time | 7m 17s |

## Problem Statement

Given a strictly sorted 2D matrix** mat**[][] of size **n x m **and** **a number **x.** Find whether the number **x** is present in the matrix or not.
**Note:** In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the **i**th row (**i**!=0) is greater than the last element of the (**i-1**)th row.

**Examples:**

**Input**: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
**Output**: true
**Explanation**: 14 is present in the matrix, so output is true.
**Input**: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
**Output**: false
**Explanation**: 42 is not present in the matrix.
**Input**: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
**Output**: true
**Explanation**: 101 is present in the matrix.**Constraints:
**1 &le; n, m &le; 1000
1 &le; mat[i][j] &le; 109
1 &le; x &le; 109

## Solutions

```Java
class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int row = mat.length-1;
        int col = 0;
        while(row >= 0 && col < mat[0].length){
            if(mat[row][col] == x){
                return true;
            }
            else if(mat[row][col] < x){
                col++;
            }
            else{
                row--;
            }
        }
        return false;
    }
}

```
