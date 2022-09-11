package InterviewQuestions.Task8;

public class Task8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("2147483646"));
        System.out.println(solution.myAtoi("+123"));
        System.out.println(solution.myAtoi("-123"));
        System.out.println(solution.myAtoi("+1289898089083"));
        System.out.println(solution.myAtoi("-1289898089083"));
        System.out.println(solution.myAtoi("123"));
        System.out.println(solution.myAtoi("+123ghfjhgjf"));
        System.out.println(solution.myAtoi("ghfjgh123"));
        System.out.println(solution.myAtoi("+gg123"));
        System.out.println(solution.myAtoi(" "));
        System.out.println(solution.myAtoi(" -"));
    }
}

class Solution {
    public int myAtoi(String s) {
        boolean negative = false;
        int i = 0, len = s.length();

        while (i < len && s.charAt(i) == ' ') {
            ++i;
        }

        if (i < len && s.charAt(i) == '+') {
            ++i;
        } else if (i < len && s.charAt(i) == '-') {
            negative = true;
            ++i;
        }

        long result = 0;
        for (; i < len; ++i) {
            char ch = s.charAt(i);
            if ('9' >= ch && ch >= '0') {
                if (result > Integer.MAX_VALUE / 10 ||
                        result == Integer.MAX_VALUE / 10 && (ch - '0') > Integer.MAX_VALUE % 10) {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + ch - '0';
            } else {
                break;
            }
        }

        return negative ? -(int) result : (int) result;
    }
}
