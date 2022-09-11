package FirstSteps.Test3;

import java.util.HashMap;
import java.util.Map;

public class Task383 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("ds", "bc"));
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> charsCount = new HashMap<>();
        Map<Character, Integer> charsCount2 = new HashMap<>();

        countLettersInString(magazine, charsCount);
        countLettersInString(ransomNote, charsCount2);

        for (var entry : charsCount2.entrySet()) {
            Character key = entry.getKey();
            if (!charsCount.containsKey(key) || charsCount.get(key) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    private void countLettersInString(String string, Map<Character, Integer> charsCount) {
        for (int i = 0; i < string.length(); ++i) {
            Character character = string.charAt(i);
            if (charsCount.containsKey(character)) {
                charsCount.put(character, charsCount.get(character) + 1);
            } else {
                charsCount.put(character, 1);
            }
        }
    }

//    public boolean canConstruct2(String ransomNote, String magazine) {
//        if (ransomNote.length() > magazine.length()) {
//            return false;
//        }
//
//        for (int i = 0; i < ransomNote.length(); ++i) {
//            int prevLen = magazine.length();
//            magazine = magazine.replaceFirst(Character.toString(ransomNote.charAt(i)), "");
//            if (prevLen == magazine.length()) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public boolean canConstruct3(String ransomNote, String magazine) {
//        Map<Character, Integer> charsCount = new HashMap<>();
//
//        for (int i = 0; i < magazine.length(); ++i) {
//            Character character = magazine.charAt(i);
//            if (charsCount.containsKey(character)) {
//                charsCount.put(character, charsCount.get(character) + 1);
//            } else {
//                charsCount.put(character, 1);
//            }
//        }
//
//        for (int i = 0; i < ransomNote.length(); ++i) {
//            char ch = ransomNote.charAt(i);
//            if (!charsCount.containsKey(ch)) {
//                return false;
//            }
//
//            charsCount.put(ch, charsCount.get(ch) - 1);
//
//            if (charsCount.get(ch) < 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
