package InterviewQuestions.Task54;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task54 {
    public static void main(String[] args) {
        System.out.println(new Solution().spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));
        System.out.println(new Solution().spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        }));
        System.out.println(new Solution().spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        }));
        System.out.println(new Solution().spiralOrder(new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
        }));
        System.out.println(new Solution().spiralOrder(new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        }));
    }
}

class Solution {
    public List<Integer> spiralOrder2(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int iLast = matrix.length, iFirst = 0, iPos = 0;
        int jLast = matrix[0].length, jFirst = 0, jPos = 0;
        int count = iLast * jLast;
        while (count-- > 0) {
            result.add(matrix[iPos][jPos]);
            if (jPos < jLast - 1 && iPos == iFirst && iFirst + iLast == matrix.length) {
                ++jPos;
                if (jPos == jLast - 1) {
                    ++iFirst;
                }
            } else if (iPos < iLast - 1 && jPos == jLast - 1 && jFirst + jLast == matrix[0].length) {
                ++iPos;
                if (iPos == iLast - 1) {
                    --jLast;
                }
            } else if (jPos > jFirst && iPos == iLast - 1) {
                --jPos;
                if (jPos == jFirst) {
                    --iLast;
                }
            } else if (iPos > iFirst) {
                --iPos;
                if (iPos == iFirst) {
                    ++jFirst;
                }
            }
        }
        return result;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix == null || matrix.length == 0) return res;
        int n = matrix.length, m = matrix[0].length;
        int up = 0,  down = n - 1;
        int left = 0, right = m - 1;
        while (res.size() < n * m) {
            for (int j = left; j <= right && res.size() < n * m; j++)
                res.add(matrix[up][j]);

            for (int i = up + 1; i <= down - 1 && res.size() < n * m; i++)
                res.add(matrix[i][right]);

            for (int j = right; j >= left && res.size() < n * m; j--)
                res.add(matrix[down][j]);

            for (int i = down - 1; i >= up + 1 && res.size() < n * m; i--)
                res.add(matrix[i][left]);

            left++; right--; up++; down--;
        }
        return res;
    }

}
