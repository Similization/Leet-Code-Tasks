package otherTasks.Task58;

public class Task58 {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
        System.out.println(new Solution().lengthOfLastWord(""));
        System.out.println(new Solution().lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(new Solution().lengthOfLastWord("    "));
        System.out.println(new Solution().lengthOfLastWord("luffy is still joyboy"));
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        int i = s.length() - 1;
        for (; i >= 0; --i) {
            if (s.charAt(i) == ' ') {
                break;
            }
        }
        return s.length() - i - 1;
    }
}
