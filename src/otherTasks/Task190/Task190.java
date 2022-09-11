package otherTasks.Task190;

import java.util.BitSet;

public class Task190 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseBits(Integer.parseInt("00000010100101000001111010011100", 2)));
        System.out.println(new Solution().reverseBits(-3));
    }
}

class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            result <<= 1;
            result += n & 1;
            n >>= 1;
            System.out.println(Integer.toBinaryString(n));
        }
        return result;
    }
}
