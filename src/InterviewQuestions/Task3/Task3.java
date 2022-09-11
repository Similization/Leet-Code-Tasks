package InterviewQuestions.Task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring3("abc5  abcded"));
        System.out.println(solution.lengthOfLongestSubstring3("bbbbbb"));
        System.out.println(solution.lengthOfLongestSubstring3(" "));
        System.out.println(solution.lengthOfLongestSubstring3("dvdf"));
        System.out.println(solution.lengthOfLongestSubstring3("abcabcbb"));
    }
}

class Solution {
    public int lengthOfLongestSubstring3(String s) {
        int max = 0;
        Map<Character, Integer> charCount = new HashMap<>(Math.min(26, s.length()));

        for (int j = 0, i = 0; j < s.length(); ++j) {
            if (charCount.containsKey(s.charAt(j))) {
                i = Math.max(charCount.get(s.charAt(j)) + 1, i);
            }
            charCount.put(s.charAt(j), j);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}