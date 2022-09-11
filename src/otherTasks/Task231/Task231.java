package otherTasks.Task231;

public class Task231 {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(16));
        System.out.println(new Solution().isPowerOfTwo(10));
        System.out.println(new Solution().isPowerOfTwo(3));
        System.out.println(new Solution().isPowerOfTwo(1));
        System.out.println(new Solution().isPowerOfTwo(-32));
    }
}

class Solution {
    public boolean isPowerOfTwo2(int n) {
        if (n < 0) { return false; }
        int count = 0;
        while (n != 0 && count < 2) {
            count += n & 1;
            n >>= 1;
        }
        return count == 1;
    }
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
