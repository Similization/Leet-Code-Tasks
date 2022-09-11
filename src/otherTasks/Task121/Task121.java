package otherTasks.Task121;

import java.util.Arrays;

public class Task121 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit2(new int[]{7, 6, 5, 1, 8, 12, 2, 100}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            int max = 0;
            for (int j = i + 1; j < prices.length; ++j) {
                max = Math.max(max, prices[j]);
            }
            result = Math.max(result, max - prices[i]);
        }
        return result;
    }
    public int maxProfit2(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist;

        for (int price : prices) {
            if (price < lsf) {
                lsf = price;
            }
            pist = price - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }
}