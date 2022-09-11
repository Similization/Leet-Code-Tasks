package otherTasks.Task509;

public class Task509 {
    public static void main(String[] args) {
        System.out.println(new Solution().fib(4));
        System.out.println(new Solution().fib(5));
        System.out.println(new Solution().fib(6));
        System.out.println(new Solution().fib(7));

        System.out.println(new Solution().fib2(4));
        System.out.println(new Solution().fib2(5));
        System.out.println(new Solution().fib2(6));
        System.out.println(new Solution().fib2(7));
    }
}

class Solution {
    public int fib2(int n) {
        if (n < 2) { return n; }
        int a = 0, b = 1;
        while (n-- > 2) {
            int val = a;
            a = b;
            b = val + a;
        }
        return a + b;
    }
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
