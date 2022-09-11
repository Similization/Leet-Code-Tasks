package otherTasks.Task303;

import InterviewQuestions.Solution;

public class Task303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}

class NumArray2 {
    private final int[] nums;
    public NumArray2(int[] nums) {
        this.nums = new int[nums.length];
        System.arraycopy(nums, 0, this.nums, 0, nums.length);
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; ++i) {
            sum += nums[i];
        }
        return sum;
    }
}

class NumArray {
    private final int[] nums;
    public NumArray(int[] nums) {
        this.nums = new int[nums.length];
        this.nums[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            this.nums[i] = this.nums[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return left == 0 ? nums[right] : nums[right] - nums[left - 1];
    }
}
