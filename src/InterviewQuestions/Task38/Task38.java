package InterviewQuestions.Task38;

public class Task38 {
    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(1));
        System.out.println(new Solution().countAndSay(2));
        System.out.println(new Solution().countAndSay(3));
        System.out.println(new Solution().countAndSay(4));
        System.out.println(new Solution().countAndSay(5));
        System.out.println(new Solution().countAndSay(6));
    }
}

class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int prevPos = 0;
        int count = 1;
        for (int i = 1; i < prev.length(); ++i) {
            if (prev.charAt(i) != prev.charAt(prevPos)) {
                result.append(Character.toString('0' + count)).append(prev.charAt(prevPos));
                prevPos = i;
                count = 1;
            } else {
                ++count;
            }
        }
        if (count != 0) {
            result.append(Character.toString('0' + count)).append(prev.charAt(prevPos));
        }
        return result.toString();
    }
}
