package InterviewQuestions.Task29;

public class Task29 {
    public static void main(String[] args) {
        System.out.println(new Solution().divide(10, 3));
        System.out.println(new Solution().divide(-2147483648,-1));
        System.out.println(new Solution().divide(2147483647,1));
    }
}

class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        long pDividend = Math.abs((long) dividend);
        long pDivisor = Math.abs((long) divisor);

        int result = 0;
        while (pDividend >= pDivisor) {
            int numShift = 0;
            while (pDividend >= (pDivisor << numShift)) {
                numShift++;
            }
            result += 1 << (numShift - 1);
            pDividend -= (pDivisor << (numShift - 1));
        }

        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            return result;
        } else {
            return -result;
        }
    }
}