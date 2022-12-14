package otherTasks.Task463;

public class Task463 {
    public static void main(String[] args) {
        System.out.println(new Solution().islandPerimeter(new int[][]{
                {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
        }));
        System.out.println(new Solution().islandPerimeter(new int[][]{
                {1}
        }));
        System.out.println(new Solution().islandPerimeter(new int[][]{
                {1, 0}
        }));
    }
}

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 0) {
                    continue;
                }
                perimeter += 4;
                if (j > 0 && grid[i][j - 1] == 1) {
                    perimeter -= 2;
                }
                if (i > 0 && grid[i - 1][j] == 1) {
                    perimeter -= 2;
                }
            }
        }
        return perimeter;
    }
}