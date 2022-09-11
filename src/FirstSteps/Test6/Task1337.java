package FirstSteps.Test6;

import java.util.*;

public class Task1337 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[][] mat = {{1, 1},{1, 0},{1, 0},{1, 1},{0, 0},{1, 1}};
        System.out.println(Arrays.toString(solution.kWeakestRows(mat, 1)));
    }
}

class Solution {
    public int sum(int[] args, int len) {
        int sum = 0;
        for (var el : args) {
            sum += el * len;
        }
        return sum;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int len = mat.length;
        PriorityQueue<int[]> rowCount = new PriorityQueue<>((a, b) -> a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]);
        for (int i = 0; i < len; ++i) {
            rowCount.offer(new int[] {sum(mat[i], len) + i, i});
            if (rowCount.size() > k) {
                rowCount.poll();
            }
        }

        int[] res = new int[k];
        while(k-- > 0) {
            res[k] = Objects.requireNonNull(rowCount.poll())[1];
        }
        return res;
    }
}
