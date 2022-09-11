package otherTasks.Task342;

public class Task342 {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfFour(1));
        System.out.println(new Solution().isPowerOfFour(2));
        System.out.println(new Solution().isPowerOfFour(4));
        System.out.println(new Solution().isPowerOfFour(8));
        System.out.println(new Solution().isPowerOfFour(3));
        System.out.println(new Solution().isPowerOfFour(27));
    }
}

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) { return false; }
        while (n != 1) {
            if ((n & 11) != 0) {
                return false;
            }
            n >>= 2;
        }
        return true;
    }
    public boolean isPowerOfFour2(int n) {
        return n > 0 && (n & (n - 1)) == 0 & (n & 1431655765) == n;
    }
}