package otherTasks.Task125;

public class Task125 {
    public static void main(String[] args) {
//        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(new Solution().isPalindrome("race a car"));
        System.out.println(new Solution().isPalindrome("ab2a"));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            while (!( Character.isLetterOrDigit(s.charAt(left)) )) {
                ++left;
                if (left == s.length()) { return true; }
            }
            while (!( Character.isLetterOrDigit(s.charAt(right)) )) {
                --right;
                if (right == -1) { return true; }
            }
            if (s.charAt(left) != s.charAt(right)) { return false; }
            ++left;
            --right;
        }
        return true;
    }
    public boolean isPalindrome2(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
                return false;
        }
        return true;
    }
}
