package otherTasks.Task495;

public class Task495 {
    public static void main(String[] args) {
        System.out.println(new Solution().findPoisonedDuration(new int[]{1, 4}, 2));
        System.out.println(new Solution().findPoisonedDuration(new int[]{1, 2}, 2));
        System.out.println(new Solution().findPoisonedDuration(new int[]{1, 5}, 0));
        System.out.println(new Solution().findPoisonedDuration(new int[]{1, 5, 6, 8, 12}, 3));
    }
}

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        for (int i = 1; i < timeSeries.length; ++i) {
            res += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        }
        return res + duration;
    }
}