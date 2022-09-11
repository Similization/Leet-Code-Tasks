package otherTasks.Task338;

import java.util.Arrays;

public class Task338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().countBits(5)));
        System.out.println(Arrays.toString(new Solution().countBits(10)));
        System.out.println(Arrays.toString(new Solution().countBits(15)));
        System.out.println(Arrays.toString(new Solution().countBits(1)));
    }
}

class Solution {
    int countBitsInNumber(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            res[i] = countBitsInNumber(i);
        }
        return res;
    }
}
