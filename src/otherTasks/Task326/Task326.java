package otherTasks.Task326;

import java.util.BitSet;

public class Task326 {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfThree(27));
        System.out.println(new Solution().isPowerOfThree(0));
        System.out.println(new Solution().isPowerOfThree(1));
        System.out.println(new Solution().isPowerOfThree(2));
        System.out.println(new Solution().isPowerOfThree(3));
        System.out.println(new Solution().isPowerOfThree(4));
        System.out.println(new Solution().isPowerOfThree(5));
        System.out.println(new Solution().isPowerOfThree(6));
        System.out.println(new Solution().isPowerOfThree(7));
    }
}

// 00000000 00000000 00000000 00000011 3
// 00000000 00000000 00000000 00001001 9
// 00000000 00000000 00000000 00011011 27
// 00000000 00000000 00000000 01010001 81
// 00000000 00000000 00000000 11110011 243
class Solution {
    public boolean isPowerOfThree3(int n) {
        if (n == 0) { return false; }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public boolean isPowerOfThree2(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
    public boolean isPowerOfThree(int n) {
        return Integer.toString(n, 3).matches("^10*$");
    }
}
