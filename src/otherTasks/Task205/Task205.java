package otherTasks.Task205;

import java.util.HashMap;
import java.util.Map;

public class Task205 {
    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("egg", "boo"));
        System.out.println(new Solution().isIsomorphic("badc", "baba"));
        System.out.println(new Solution().isIsomorphic("title", "paper"));
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> characterMap = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            if (!characterMap.containsKey(s.charAt(i)) && characterMap.containsValue(t.charAt(i)) ||
                characterMap.containsKey(s.charAt(i)) && characterMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            characterMap.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
    private String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);

            if (!indexMapping.containsKey(c1)) {
                indexMapping.put(c1, i);
            }

            builder.append(Integer.toString(indexMapping.get(c1)));
            builder.append(" ");
        }
        return builder.toString();
    }

    public boolean isIsomorphic2(String s, String t) {
        return transformString(s).equals(transformString(t));
    }
}
