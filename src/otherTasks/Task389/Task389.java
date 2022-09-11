package otherTasks.Task389;

public class Task389 {
    public static void main(String[] args) {
        System.out.println(new Solution().findTheDifference("abcd", "abcde"));
        System.out.println(new Solution().findTheDifference("", "y"));
        System.out.println(new Solution().findTheDifference("sasa", "sasaa"));

        System.out.println(new Solution().findTheDifference2("abcd", "abcde"));
        System.out.println(new Solution().findTheDifference2("", "y"));
        System.out.println(new Solution().findTheDifference2("sasa", "sasaa"));
    }
}

class Solution {
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            chars[s.charAt(i) - 'a'] += 1;
            chars[t.charAt(i) - 'a'] -= 1;
        }
        chars[t.charAt(s.length()) - 'a'] -= 1;
        for (int i = 0; i < 26; ++i) {
            if (chars[i] == -1) {
                return (char)('a' + i);
            }
        }
        return 'a';
    }
    public char findTheDifference2(String s, String t) {
        int[] chars = new int[26];
        for (var ch : s.toCharArray()) chars[ch - 'a'] += 1;
        for (var ch : t.toCharArray()) chars[ch - 'a'] -= 1;
        for (int i = 0; i < 26; ++i) {
            if (chars[i] == -1) {
                return (char)('a' + i);
            }
        }
        return 'a';
    }
}
