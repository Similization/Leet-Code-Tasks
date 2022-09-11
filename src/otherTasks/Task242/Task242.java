package otherTasks.Task242;

import java.util.Objects;

public class Task242 {
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("anagram", "nagaram"));
        System.out.println(new Solution().isAnagram("cat", "rat"));
        System.out.println(new Solution().isAnagram("aacc", "ccac"));
    }
}

class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charsCount = new int[52];
        for (int i = 0; i < s.length(); ++i) {
            charsCount[s.charAt(i) - 'a'] += 1;
            charsCount[t.charAt(i) - 'a' + 26] += 1;
        }
        for (int i = 0; i < 26; ++i) {
            if (charsCount[i] != charsCount[i + 26]) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for (var ch : s.toCharArray()) {
            var len = t.length();
            t = t.replaceFirst(String.valueOf(ch), "");
            if (len == t.length()) {
                return false;
            }
        }
        return true;
    }
}
