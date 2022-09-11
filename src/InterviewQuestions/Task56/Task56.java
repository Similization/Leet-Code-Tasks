package InterviewQuestions.Task56;

import java.util.ArrayList;
import java.util.List;

public class Task56 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> newIntervals = new ArrayList<>();
        int left = intervals[0][0];
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; ++i) {
            int newLeft = intervals[i][0];
            int newRight = intervals[i][1];
            if (newLeft > right) {
                newIntervals.add(new int[]{left, right});
                left = newLeft;
                right = newRight;
            } else if (newRight > right) {
                right = newRight;
            }
        }
        return new int[][]{};
    }
}
