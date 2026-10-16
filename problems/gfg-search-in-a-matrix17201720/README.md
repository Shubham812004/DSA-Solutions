# Search in a Row-Column Sorted

| Field | Value |
|-------|-------|
| Difficulty | Easy |
| Platform | Geeksforgeeks |
| Problem ID | `gfg-search-in-a-matrix17201720` |
| Topics | Searching, Matrix |
| Solved | 2026-10-16 |
| Solve Time | 2m 44s |

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
