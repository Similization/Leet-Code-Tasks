package otherTasks.Task217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task217 {
    public static void main(String[] args) {
        System.out.println(new Solution().containsDuplicate2(new int[]{1, 2, 3, 4}));
        System.out.println(new Solution().containsDuplicate2(new int[]{1, 2, 3, 4, 1, 1}));
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (var num : nums) {
            if (integerSet.contains(num)) {
                return true;
            }
            integerSet.add(num);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1, pos = 0; i < nums.length; ++i) {
            if (nums[pos] == nums[i]) {
                return true;
            }
            pos = i;
        }
        return false;
    }
    public boolean containsDuplicate3(int[] nums) {
        return nums.length != Arrays.stream(nums)
                .distinct()
                .count();
    }
}
