package otherTasks.Task485;

public class Task485 {
    public static void main(String[] args) {
        System.out.println(new Solution().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                ++count;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return Math.max(count, max);
    }
}