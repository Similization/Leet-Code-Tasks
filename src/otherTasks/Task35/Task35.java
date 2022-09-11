package otherTasks.Task35;

public class Task35 {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1, 2, 5, 6}, 5));
        System.out.println(new Solution().searchInsert(new int[]{1, 2, 5, 6}, 1));
        System.out.println(new Solution().searchInsert(new int[]{1, 2, 5, 6}, 6));

        System.out.println(new Solution().searchInsert(new int[]{2, 5, 6}, 1));
        System.out.println(new Solution().searchInsert(new int[]{1, 5, 6}, 3));
        System.out.println(new Solution().searchInsert(new int[]{1, 5, 6}, 7));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
