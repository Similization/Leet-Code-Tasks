package InterviewQuestions.Task49;

import java.util.*;

public class Task49 {
    public static void main(String[] args) {
        System.out.println(new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(new Solution().groupAnagrams(new String[]{""}));
        System.out.println(new Solution().groupAnagrams(new String[]{"a"}));
        System.out.println(new Solution().groupAnagrams(new String[]{"abb", "aab"}));
    }
}

class Solution {
    static class LetterCount {
        Map<Character, Integer> letterCount = new HashMap<>();

        public LetterCount(String chars) {
            for (var ch : chars.toCharArray()) {
                if (!letterCount.containsKey(ch)) {
                    letterCount.put(ch, 1);
                }
                letterCount.put(ch, letterCount.get(ch) + 1);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            if (letterCount.size() == ((LetterCount) o).letterCount.size()) {
                for (var pair : letterCount.entrySet()) {
                    if (!((LetterCount) o).letterCount.containsKey(pair.getKey())) {
                        return false;
                    }
                    if (!Objects.equals(pair.getValue(), ((LetterCount) o).letterCount.get(pair.getKey()))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(letterCount);
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<LetterCount, List<String>> charArrayTypes = new HashMap<>();
        for (var str : strs) {
            var lc = new LetterCount(str);
            if (!charArrayTypes.containsKey(lc)) {
                charArrayTypes.put(lc, new ArrayList<>());
            }
            charArrayTypes.get(lc).add(str);
        }
        return new ArrayList<>(charArrayTypes.values());
    }


    public List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> ans = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList<>());
            ans.get(key).add(str);
        }
        return new ArrayList<>(ans.values());
    }

}
