package InterviewQuestions.Task55;

public class Task55 {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean canJump(int[] nums) {
        int pos = 0;
        int zeroPos = -1;
        while (pos < nums.length) {
            if (nums[pos + nums[pos]] == 0) {
                zeroPos = pos + nums[pos];
            }
            ++pos;
            while (pos + nums[pos] <= zeroPos) {
                ++pos;
            }
            if (pos + nums[pos] >= nums.length - 1) {
                return true;
            }
            if (pos + nums[pos] <= zeroPos) {
                return false;
            }
            pos += nums[pos];
        }
        return true;
    }
}
