package InterviewQuestions.Task48;

import java.util.Arrays;

public class Task48 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().rotate(new int[][]{{1}})));
        System.out.println(Arrays.deepToString(new Solution().rotate(new int[][]{
                {1, 2},
                {3, 4}
        })));
        System.out.println(Arrays.deepToString(new Solution().rotate(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8 ,9}
        })));
        System.out.println(Arrays.deepToString(new Solution().rotate(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        })));
    }
}

class Solution {
    public int[][] rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len / 2; ++i) {
            for (int j = i; j < len - i - 1; ++j) {
                int posX = i;
                int posY = j;
                int prevVal = matrix[i][j];
                for (int k = 0; k < 4; ++k) {
                    int newPosX = posY;
                    int newPosY = len - posX - 1;
                    int nextVal = matrix[newPosX][newPosY];
                    matrix[newPosX][newPosY] = prevVal;
                    prevVal = nextVal;
                    posX = newPosX;
                    posY = newPosY;
                }
            }
        }
        return matrix;
    }
    public void rotate2(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len / 2; ++i) {
            for (int j = i; j < len - i - 1; ++j) {
                int posX = i;
                int posY = j;
                int prevVal = matrix[i][j];
                for (int k = 0; k < 4; ++k) {
                    int newPosX = posY;
                    int newPosY = len - posX - 1;
                    int nextVal = matrix[newPosX][newPosY];
                    matrix[newPosX][newPosY] = prevVal;
                    prevVal = nextVal;
                    posX = newPosX;
                    posY = newPosY;
                }
            }
        }
    }
}
