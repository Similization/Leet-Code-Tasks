package otherTasks.Task228;

import java.util.ArrayList;
import java.util.List;

public class Task228 {
    public static void main(String[] args) {
        System.out.println(new Solution().summaryRanges(new int[]{}));
        System.out.println(new Solution().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(new Solution().summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }
}

class Solution {
    public String getRange(int[] nums, int left, int right) {
        if (left == right) {
            return String.valueOf(nums[left]);
        } else {
            return nums[left] + "->" + nums[right];
        }
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) { return result; }
        int left = 0, i = 1;
        for (; i < nums.length; ++i) {
            if (nums[i] != nums[i - 1] + 1) {
                result.add(getRange(nums, left, i));
                left = i;
            }
        }
        result.add(getRange(nums, left, nums.length - 1));
        return result;
    }
}
