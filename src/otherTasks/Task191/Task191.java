package otherTasks.Task191;

import java.util.Map;

public class Task191 {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(
                Integer.parseInt("00000000000000000000000000001011", 2)
                ));
        System.out.println(new Solution().hammingWeight(
                -3
                ));
        System.out.println(new Solution().hammingWeight(
                Integer.MAX_VALUE
        ));
    }
}

class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += n >> 31 & 1;
            n <<= 1;
        }
        return result;
    }
}
