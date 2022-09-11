package InterviewQuestions.Task12;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"press", "pre", "prb"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"fog", "pre", "top"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"fog", "", "top"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"fog", " ", "top"}));
        System.out.println(new Solution().longestCommonPrefix(new String[]{"ab", "a"}));
    }
}

class Solution {
    public String longestCommonPrefix2(String[] strs) {
        String result = strs[0];
        var lastIndex= result.length();

        for (String str : strs) {
            if (str.length() == 0) {
                return "";
            }
            int newIndex = 0;
            while (newIndex < lastIndex && newIndex < str.length() && str.charAt(newIndex) == result.charAt(newIndex)) {
                ++newIndex;
            }
            lastIndex = newIndex;
        }
        return result.substring(0, lastIndex);
    }
    public String longestCommonPrefix(String[] strs) {
        var lastIndex = Integer.MAX_VALUE;

        for (String str : strs) {
            int newIndex = 0;
            while (newIndex < Math.min(lastIndex, str.length()) &&
                    str.charAt(newIndex) == strs[0].charAt(newIndex)
            ) {
                ++newIndex;
            }
            lastIndex = newIndex;
        }
        return strs[0].substring(0, lastIndex);
    }
}