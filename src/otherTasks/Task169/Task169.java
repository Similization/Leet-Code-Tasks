package otherTasks.Task169;

public class Task169 {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{7, 7, 1, 7, 1, 1, 5, 1, 1}));
        System.out.println(new Solution().majorityElement2(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public int majorityElement2(int[] nums) {
        int el = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (count == 0) {
                el = nums[i];
            }
            if (nums[i] == el) {
                ++count;
            } else {
                --count;
            }
        }
        return el;
    }
}
