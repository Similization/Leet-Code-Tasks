package otherTasks.Task367;

public class Task367 {
    public static void main(String[] args) {
        System.out.println(new Solution().isPerfectSquare(81));
    }
}

class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = 46_340;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left * left == num;
    }
}