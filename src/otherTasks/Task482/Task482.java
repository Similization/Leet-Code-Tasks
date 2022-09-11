package otherTasks.Task482;

public class Task482 {
    public static void main(String[] args) {
        System.out.println(new Solution().licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(new Solution().licenseKeyFormatting("2-5g-3-J", 2));
    }
}

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i) {
            var ch = s.charAt(i);
            if (ch != '-') {
                if (stringBuilder.length() % (k + 1) == k) {
                    stringBuilder.append('-');
                }
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.reverse().toString().toUpperCase();
    }
}