package InterviewQuestions.Task7;

public class Task7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(-23));
        System.out.println(solution.reverse(1534236469));
    }
}

// 120
// 0 12
// 2

class Solution {
    public int reverse(int x) {
        long revNum = 0;
        while (Math.abs(x) > 0) {
            revNum = revNum * 10 + x % 10;
            x /= 10;
        }
        return Math.abs(revNum) < Integer.MAX_VALUE ? (int) revNum : 0;
    }
}
