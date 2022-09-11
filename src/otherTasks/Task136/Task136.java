package otherTasks.Task136;

import java.util.Arrays;

public class Task136 {
    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(new Solution().singleNumber(new int[]{1, 1, 3, 3, 2}));
        System.out.println(new Solution().singleNumber(new int[]{1, 2, 1}));
        System.out.println(new Solution().singleNumber(new int[]{2, 2, 1}));
        System.out.println(new Solution().singleNumber(new int[]{1,2,3,2,3}));
    }
}

class Solution {
    public int singleNumber2(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        int prev = nums[0];
        for (int i = 1; i < nums.length - 1; ++i) {
            if (nums[i] > prev) {
                return prev;
            } else {
                prev = nums[++i];
            }
        }
        return nums[nums.length - 1];
    }
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
