# Search in Sorted Matrix

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-search-in-a-matrix-1587115621` |
| Topics | Searching, Matrix |
| Solved | 2026-10-21 |
| Solve Time | 7m 17s |

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
