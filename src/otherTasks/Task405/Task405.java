package otherTasks.Task405;

public class Task405 {
    public static void main(String[] args) {
        System.out.println(new Solution().toHex(-1));
        System.out.println(new Solution().toHex(-2));
        System.out.println(new Solution().toHex(-26));
        System.out.println(new Solution().toHex(-226));
    }
}

class Solution {
    public String toHex(int num) {
        StringBuilder result = new StringBuilder();
        if (num > 0) {
            while (num != 0) {
                var ost = num % 16;
                if (ost < 10) {
                    result.insert(0, ost);
                } else {
                    result.insert(0, (char) ('a' + ost - 10));
                }
                num /= 16;
            }
        }
        else {
            num = -num;
            while (num != 0) {
                if (result.isEmpty()) {
                    num += 1;
                }
                var ost = 15 - num % 16;
                if (ost < 10) {
                    result.insert(0, ost);
                } else {
                    result.insert(0, (char) ('a' + ost - 10));
                }
                num /= 16;
            }
        }
        return result.isEmpty() ? "0" : result.toString();
    }
}