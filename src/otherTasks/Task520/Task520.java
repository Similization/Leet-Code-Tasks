package otherTasks.Task520;

import java.util.Locale;
import java.util.Objects;

public class Task520 {
    public static void main(String[] args) {
        System.out.println(new Solution().detectCapitalUse("USA"));
        System.out.println(new Solution().detectCapitalUse("leetcode"));
        System.out.println(new Solution().detectCapitalUse("Google"));
        System.out.println(new Solution().detectCapitalUse("GooglE"));
        System.out.println(new Solution().detectCapitalUse("oogleT"));
    }
}

class Solution {
    public boolean detectCapitalUse(String word) {
       int capitalCount = 0;
       for (int i = 0; i < word.length(); ++i) {
           capitalCount += Character.isUpperCase(word.charAt(i)) ? 1 : 0;
       }
       return (capitalCount == 0 || capitalCount == word.length() ||
               capitalCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}