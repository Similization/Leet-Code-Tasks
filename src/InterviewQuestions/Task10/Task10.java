package InterviewQuestions.Task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("aa", "a*"));
        System.out.println(new Solution().isMatch("aa", ".*"));
        System.out.println(new Solution().isMatch("aa", "a"));
        System.out.println(new Solution().isMatch("abc", "a.*"));
        System.out.println(new Solution().isMatch("cc", ".*c.*c"));
        System.out.println(new Solution().isMatch("cc", ".*c.*c*"));
    }
}

class Solution {
    public boolean isMatch2(String s, String p) {
        int patternIndex = 0;
        int matcherIndex = 0;
        boolean isAny;
        boolean isUnlimited;

        while (patternIndex < p.length()) {
            char ch = p.charAt(patternIndex);
            isAny = ch == '.';
            isUnlimited = patternIndex + 1 < p.length() && p.charAt(patternIndex + 1) == '*';

            if (isAny && isUnlimited) {
                if (patternIndex + 2 < p.length() && p.charAt(patternIndex + 2) != '.') {
                    matcherIndex = s.indexOf(p.charAt(patternIndex + 2), matcherIndex);
                    if (matcherIndex == -1) {
                        return false;
                    }
                    patternIndex += 2;
                } else if (patternIndex + 2 >= p.length()) {
                    return true;
                }
            }

            if (isAny) {
                ++matcherIndex;
            }
            else if (isUnlimited) {
                while(matcherIndex < s.length() && s.charAt(matcherIndex) == ch) {
                    ++matcherIndex;
                }
                ++patternIndex;
            }
            else if (matcherIndex < s.length() && s.charAt(matcherIndex) == ch) {
                ++matcherIndex;
            }
            else {
                return false;
            }
            ++patternIndex;

            if (matcherIndex > s.length()) {
                return false;
            }
        }
        return matcherIndex == s.length();
    }
    public boolean isMatch(String s, String p) {
        return s.matches(p);
    }
}
