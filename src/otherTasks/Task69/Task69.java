package otherTasks.Task69;

public class Task69 {
    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(1));
        System.out.println(new Solution().mySqrt(4));
        System.out.println(new Solution().mySqrt(5));
        System.out.println(new Solution().mySqrt(6));
        System.out.println(new Solution().mySqrt(7));
        System.out.println(new Solution().mySqrt(8));
        System.out.println(new Solution().mySqrt(9));
    }
}

class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 0, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else if (mid + 1 > x / (mid + 1)) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
