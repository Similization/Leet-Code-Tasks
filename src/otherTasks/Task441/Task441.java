package otherTasks.Task441;

public class Task441 {
    public static void main(String[] args) {
        System.out.println(new Solution().arrangeCoins(1));
        System.out.println(new Solution().arrangeCoins(2));
        System.out.println(new Solution().arrangeCoins(3));
        System.out.println(new Solution().arrangeCoins(5));
        System.out.println(new Solution().arrangeCoins(6));
        System.out.println(new Solution().arrangeCoins(8));
        System.out.println(new Solution().arrangeCoins(10));

    }
}

// 1 2 3 4 5 6 .. k
// n = 5
// (k + 1) * k / 2

// k == 6 --> f == 21
// k == 5 --> f == 15
// if x between 5 and 6 --> 15 < n < 21, where x is searched row
class Solution {
    public int arrangeCoins2(int n) {
        int count = 0;
        do {
            n -= ++count;
        } while (n > 0);
        return n == 0 ? count : count - 1;
    }

    public int arrangeCoins3(int n) {
        int left = 0, right = n;
        while (left < right) {
            var mid = left + (right - left) / 2;
            long fun = (long) mid * (mid + 1) / 2;
            if (fun > n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return n == 1 ? 1 : right - 1;
    }
    public int arrangeCoins(int n) {
        int left = 0, right = n;
        while (left <= right) {
            var mid = left + (right - left) / 2;
            long fun = (long) mid * (mid + 1) / 2;
            if (fun > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}