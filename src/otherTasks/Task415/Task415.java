package otherTasks.Task415;

public class Task415 {
    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("0", "0"));
        System.out.println(new Solution().addStrings("99", "1"));
        System.out.println(new Solution().addStrings("273", "65"));
    }
}

class Solution {
    public String addStrings2(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;

        int cel = 0;
        for (; i >= 0 && j >= 0; --i, --j) {
            int sum = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + cel;
            cel = sum / 10;
            sb.insert(0, sum % 10);
        }
        for (; i >= 0; --i) {
            int sum = (num1.charAt(i) - '0') + cel;
            cel = sum / 10;
            sb.insert(0, sum % 10);
        }
        for (; j >= 0; --j) {
            int sum = (num2.charAt(j) - '0') + cel;
            cel = sum / 10;
            sb.insert(0, sum % 10);
        }
        if (cel != 0) {
            sb.insert(0, cel);
        }
        return sb.toString();
    }
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int cel = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; --i, --j) {
            var n1 = i < 0 ? 0 : num1.charAt(i) - '0';
            var n2 = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = n1 + n2 + cel;
            cel = sum / 10;
            sb.insert(0, sum % 10);
        }
        if (cel != 0) {
            sb.insert(0, cel);
        }
        return sb.toString();
    }
}