package otherTasks.Task392;

public class Task392 {
    public static void main(String[] args) {
        System.out.println(new Solution().isSubsequence("abc", "aghgghbfhrhjfhrc"));
        System.out.println(new Solution().isSubsequence("axc", "aghgghbfhrhjfhrc"));
    }
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        for (; j < t.length() && i < s.length(); ++j) {
            if (s.charAt(i) == t.charAt(j)) {
                ++i;
            }
        }
        return i == s.length();
    }
}