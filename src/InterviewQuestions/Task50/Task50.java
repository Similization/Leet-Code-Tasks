package InterviewQuestions.Task50;

public class Task50 {
    public static void main(String[] args) {
        //System.out.println(new Solution().myPow(2, 5));
        //System.out.println(new Solution().myPow(2, 0));
        System.out.println(new Solution().myPow(2, Integer.MIN_VALUE));
        //System.out.println(Math.pow(2, Integer.MAX_VALUE));
    }
}

class Solution {
    public double myPow2(double x, int n) {
        double result = 1;
        boolean isMultiplied = true;
        if (n < 0) {
            n *= -1;
            isMultiplied = false;
        }

        while (n-- != 0) {
            if (isMultiplied) {
                result *= x;
            } else {
                result /= x;
            }
        }

        return result;
    }

    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == Integer.MIN_VALUE) {n = - (n / 2); x = 1 / (x * x);}
        if(n < 0) {n *= -1; x = 1 / x;}
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}
