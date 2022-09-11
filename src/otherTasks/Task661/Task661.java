package otherTasks.Task661;

import java.util.Arrays;

public class Task661 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().imageSmoother(new int[][]{
                {1, 1, 1}, {1, 0, 1}, {1, 1, 1}
        })));
        System.out.println(Arrays.deepToString(new Solution().imageSmoother(new int[][]{
                {100, 200, 100},
                {200, 50, 200},
                {100, 200, 100}
        })));
        System.out.println(Arrays.deepToString(new Solution().imageSmoother(new int[][]{
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13},
                {14, 15, 16}
        })));
    }
}

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length, m = img[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n * m; ++i) {
            int sum = 0, count = 0;
            for (int j = Math.max(0, i / m - 1); j < Math.min(n, i / m + 2); ++j) {
                for (int k = Math.max(0, i % m - 1); k < Math.min(m, i % m + 2); ++k) {
                    sum += img[j][k];
                    ++count;
                }
            }
            res[i / m][i % m] = sum / count;
        }
        return res;
    }
}