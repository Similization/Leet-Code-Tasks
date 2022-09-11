package otherTasks.Task268;

public class Task268 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int max = -1;
        int currSum = 0;
        boolean isContainingZero = false;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num == 0) {
                isContainingZero = true;
            }
            currSum += num;
        }
        int maxSum = (max % 2 == 0) ? max / 2 * (max + 1) : max * (max + 1) / 2;
        if (isContainingZero) {
            return 0;
        }
        if (currSum == maxSum) {
            return max + 1;
        } else {
            return maxSum - currSum;
        }
    }
}