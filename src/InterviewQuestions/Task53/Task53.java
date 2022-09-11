package InterviewQuestions.Task53;

import java.util.Arrays;

public class Task53 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(new Solution().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(new Solution().maxSubArray(new int[]{5, 4, -1, 7, 8}));
        System.out.println(new Solution().maxSubArray(new int[]{1}));
        System.out.println(new Solution().maxSubArray(new int[]{-1}));
    }
}

class Solution {
    public int maxSubArray2(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int len = 0;
        while (len <= nums.length) {
            int midSum = 0;
            for (int i = 0; i < nums.length; ++i) {
                midSum += nums[i];
                if (i >= len) {
                    sum = Math.max(sum, midSum);
                    midSum -= nums[i - len];
                }
            }
            ++len;
        }
        return sum;
    }
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int midSum = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > 0) {
                midSum += nums[i];
            } else {
                sum = Math.max(sum, midSum);
                midSum = nums[i] + nums[i-1];
            }
        }
        return Math.max(sum, midSum);
    }
}
