package FirstSteps.Test1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("LVIII"));
    }
}

class Solution {
    public boolean isSubtraction(char ch, char chNext) {
        switch (ch) {
            case 'I' -> {
                return chNext == 'V' || chNext == 'X';
            }
            case 'X' -> {
                return chNext == 'L' || chNext == 'C';
            }
            case 'C' -> {
                return chNext == 'D' || chNext == 'M';
            }
        }
        return false;
    }

    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>(7);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);

            if (i + 1 < s.length()) {
                char chNext = s.charAt(i + 1);

                if (isSubtraction(ch, chNext)) {
                    result += map.get(chNext) - map.get(ch);
                    ++i;
                    continue;
                }
            }

            result += map.get(ch);
        }
        return result;
    }
}
