package InterviewQuestions.Task66;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class Task66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{3, 2, 1})));
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> result = new Stack<>();
        int res = 1;
        for (int i = digits.length - 1; i >= 0; --i) {
            result.add((digits[i] + res) % 10);
            res = (digits[i] + res) / 10;
        }
        if (res > 0) {
            result.add(res);
        }
        int[] resultArr = new int[result.size()];
        for (int i = 0; i < resultArr.length; ++i) {
            resultArr[i] = result.pop();
        }
        return resultArr;
    }
}
