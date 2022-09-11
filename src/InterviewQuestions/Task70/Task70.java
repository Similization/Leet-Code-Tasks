package InterviewQuestions.Task70;

import java.util.stream.IntStream;

public class Task70 {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(1));
        System.out.println(new Solution().climbStairs(2));
        System.out.println(new Solution().climbStairs(3));
        System.out.println(new Solution().climbStairs(4));
        System.out.println(new Solution().climbStairs(5));
        System.out.println(new Solution().climbStairs(35));
        System.out.println(new Solution().climbStairs(7));
    }
}

class Solution {
    public static long getCNK(int n, int k) {
        long small = Math.min(n - k, k);
        long big = Math.max(n - k, k);
        int res = 1;
        for (int i = 0; i < n - big; i++) {
            res *= (big + i + 1);
        }
        for (int i = 0; i < small; i++) {
            res /= (i + 1);
        }
        return res;
    }
    public static long getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
        }
    }
    public int climbStairs(int n) {
        int twoCount = 0;
        int result = 0;
        while (twoCount <= n / 2) {
            result += getCNK(n - twoCount, twoCount);
            // result += getFactorial(n - twoCount) / getFactorial(n - twoCount * 2) / getFactorial(twoCount);
            ++twoCount;
        }
        return result;
    }
}