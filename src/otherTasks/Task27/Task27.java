package otherTasks.Task27;

public class Task27 {
    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(new Solution().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(new Solution().removeElement(new int[]{2}, 2));
        System.out.println(new Solution().removeElement(new int[]{2, 2, 2, 3}, 2));
        System.out.println(new Solution().removeElement(new int[]{3, 3, 2, 3}, 2));
        System.out.println(new Solution().removeElement(new int[]{3}, 2));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        while (j > 0 && nums[j] == val) {
            --j;
        }
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                nums[j] = val;
            }
            while (j > 0 && nums[j] == val) {
                --j;
            }
            ++i;
        }
        if (nums.length == 0 || nums[0] == val) {return 0;}
        return Math.max(j + 1, 0);
    }
    public int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public int removeElement3(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
