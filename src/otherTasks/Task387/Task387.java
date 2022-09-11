package otherTasks.Task387;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task387 {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("leetcode"));
        System.out.println(new Solution().firstUniqChar("loveleetcode"));
    }
}

class Solution {
    public int firstUniqChar2(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (var ch : s.toCharArray()) {
            if (!charCount.containsKey(ch)) {
                charCount.put(ch, 1);
            } else {
                charCount.put(ch, charCount.get(ch) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];
        for (var ch : s.toCharArray()) {
            charCount[ch - 'a'] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}