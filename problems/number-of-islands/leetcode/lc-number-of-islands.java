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