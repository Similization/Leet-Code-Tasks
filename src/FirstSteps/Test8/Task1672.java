package FirstSteps.Test8;

import java.util.Arrays;
import java.util.Comparator;

public class Task1672 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumWealth(new int[][]{{1, 2}, {7, 3}, {9, 5}}));
    }
}

class Solution {
    public int sumArr(int[] args) {
        var sum = 0;
        for(var el: args) {
            sum += el;
        }
        return sum;
    }

    public int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts).map(this::sumArr).max(Comparator.comparingInt(a -> a)).get();
    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] acc: accounts) {
            max = Math.max(max, sumArr(acc));
        }
        return max;
    }
}