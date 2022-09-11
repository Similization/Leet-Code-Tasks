package otherTasks.Task643;

public class Task643 {
    public static void main(String[] args) {
        System.out.println(new Solution().findMaxAverage(new int[]{0, 4, 0 , 3, 2}, 1));
    }
}

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, max = 0;
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }
        max = sum;
        for (int j = 0; j < nums.length - k; ++j) {
            sum = sum + nums[k + j] - nums[j];
            max = Math.max(sum, max);
        }
        return max/k;
    }
}