package InterviewQuestions.Task33;

public class Task33 {
    public static void main(String[] args) {
        //System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        //System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        //System.out.println(new Solution().search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8));
        //System.out.println(new Solution().search(new int[]{1, 3}, 3));
        System.out.println(new Solution().search(new int[]{5, 6, 7, 0, 1, 2, 4}, 3));
        System.out.println(new Solution().search(new int[]{1}, 1));
        System.out.println(new Solution().search(new int[]{4}, 2));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if ((nums[right] < nums[left] && nums[left] <= nums[mid] && nums[mid] < target) ||
                    (nums[left] <= nums[mid] && nums[mid] < target && target <= nums[right]) ||
                    (target <= nums[right] && nums[right] < nums[left] && nums[left] <= nums[mid]) ||
                    (nums[mid] < nums[right] && nums[right] >= target && target < nums[left])) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
//            if (nums[left] <= target && target < nums[mid]) {
//                right = mid - 1;
//            } else if (target < nums[mid]) {
//                left = mid + 1;
//            } else if (target >= nums[right] && target > nums[right]) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
        }
        return nums[left] == target ? left : -1;
    }
}
