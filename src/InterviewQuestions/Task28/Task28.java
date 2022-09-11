package InterviewQuestions.Task28;

public class Task28 {
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("baa", "aaa"));
        System.out.println(new Solution().strStr("abcdefghi", "ij"));
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        outerLoop:
        for (int i = 0; i < haystack.length() - needle.length() + 1; ++i) {
            for (int j = 0; j < needle.length(); ++j) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    continue outerLoop;
                }
            }
            return i;
        }
        return -1;
    }
}
