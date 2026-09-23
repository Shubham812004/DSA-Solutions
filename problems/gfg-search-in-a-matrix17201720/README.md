# Search in a Row-Column Sorted

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-search-in-a-matrix17201720` |
| Topics | Searching, Matrix |
| Solved | 2026-10-16 |
| Solve Time | 2m 44s |

## Problem Statement

Given a 2D integer matrix **mat[][]**, where every row and column is sorted in increasing order and a number **x**, return **true **if the element **x** is present in the matrix. Otherwise, return **false**.

**Examples:**

**Input**: mat[][] = [[3, 30, 38], [20, 52, 54], [35, 60, 69]], x = 62
**Output**: false
**Explanation**: 62 is not present in the matrix, so output is false.
**Input**: mat[][] = [[18, 21, 27],  [38, 55, 67]], x = 55
**Output**: true
**Explanation**: 55 is present in the matrix.**Input**: mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]], x = 3
**Output**: true
**Explanation**: 3 is present in the matrix.

## Solutions

```Java
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int r = 0;
        int c = m-1;
        while(r < n && c >= 0){
            if(mat[r][c] == x){
                return true;
            }
            else if(mat[r][c] < x){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}
```
