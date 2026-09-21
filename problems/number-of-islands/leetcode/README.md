# Number of Islands

| Field | Value |
|-------|-------|
| Difficulty | Medium |
| Platform | Leetcode |
| Problem ID | `lc-number-of-islands` |
| Topics | Graph, Array, Depth-First Search, Breadth-First Search, Union Find, Matrix |
| Solved | 2026-07-24 |
| Runtime | 4 ms (beats 46.95399999999999%) |
| Memory | 52.1 MB (beats 41.293499999999995%) |

## Problem Statement

Given an `m x n` 2D binary grid `grid` which represents a map of `'1'`s (land) and `'0'`s (water), return _the number of islands_.

An **island** is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

**Example 1:**

**Input:** grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
**Output:** 1

**Example 2:**

**Input:** grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
**Output:** 3

 

**Constraints:**

	- `m == grid.length`

	- `n == grid[i].length`

	- `1 <= m, n <= 300`

	- `grid[i][j]` is `'0'` or `'1'`.

## Solutions

```Java
class Solution {
    public void dfs(char[][] grid, boolean[][] visited, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length){
            return;
        }
        if(grid[row][col] == '0' || visited[row][col]){
            return;
        }
        visited[row][col] = true;

        dfs(grid, visited, row-1, col);
        dfs(grid, visited, row+1, col);
        dfs(grid, visited, row, col-1);
        dfs(grid, visited, row, col+1);
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return count;
    }
}
```
