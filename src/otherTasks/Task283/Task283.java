package otherTasks.Task283;

public class Task283 {
    public static void main(String[] args) {
        new Solution().moveZeroes(new int[]{0, 1, 0, 3, 12});
        new Solution().moveZeroes(new int[]{1, 0, 0, 3, 12});
        new Solution().moveZeroes(new int[]{0, 0, 0, 0, 12});
        new Solution().moveZeroes(new int[]{3, 0, 0, 0, 0});
        new Solution().moveZeroes(new int[]{3, 1, 1, 1, 1});
        new Solution().moveZeroes(new int[]{0, 0, 0, 0, 0});
    }
}

class Solution {
    public void moveZeroes2(int[] nums) {
        int i = 0, zeroPos = 0;
        outerLoop:
        while (i < nums.length) {
            while (nums[zeroPos] != 0) {
                ++zeroPos;
                if (zeroPos == nums.length) {
                    break outerLoop;
                }
            }
            while (nums[i] == 0 || i < zeroPos) {
                ++i;
                if (i == nums.length) {
                    break outerLoop;
                }
            }
            int val = nums[zeroPos];
            nums[zeroPos++] = nums[i];
            nums[i++] = val;
        }
    }

    public void moveZeroes(int[] nums) {
        int zeroPos = 0;
        while (zeroPos < nums.length && nums[zeroPos] != 0) {
            ++zeroPos;
        }
        for (int i = zeroPos + 1; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int val = nums[zeroPos];
                nums[zeroPos++] = nums[i];
                nums[i] = val;
            }
        }
    }
}
