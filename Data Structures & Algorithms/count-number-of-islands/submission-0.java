class Solution {
    public int numIslands(char[][] grid) {
        // i is row, j is col
        int islands = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                islands += sink(grid, i, j);
            }
        }
        return islands;
    }

    public int sink(char[][] grid, int i, int j) {
        if(i > grid.length - 1 || i < 0 || j > grid[i].length - 1 || j < 0)  return 0;
        if(grid[i][j] == '0') return 0;
        grid[i][j] = '0';
        sink(grid, i, j+1);
        sink(grid, i, j-1);
        sink(grid, i+1, j);
        sink(grid, i-1, j);
        return 1;
    }
}
