package otherTasks.Task434;

import java.util.Objects;

public class Task434 {
    public static void main(String[] args) {
        System.out.println(new Solution().countSegments(", , , ,        a, eaefa"));
        System.out.println(new Solution().countSegments("hello "));
        System.out.println(new Solution().countSegments(" hello "));
        System.out.println(new Solution().countSegments(" hello"));
        System.out.println(new Solution().countSegments(" "));
        System.out.println(new Solution().countSegments(""));
    }
}

class Solution {
    public int countSegments2(String s) {
        var res = s.split("\s+");
        return res.length != 0 && Objects.equals(res[0], "") ? res.length - 1 : res.length;
    }
    public int countSegments(String s) {
        int count = 0;
        boolean isNoneSpaceCharacter = false;
        for (var ch : s.toCharArray()) {
            if (ch == ' ') {
                if (isNoneSpaceCharacter) {
                    ++count;
                }
                isNoneSpaceCharacter = false;
            } else {
                isNoneSpaceCharacter = true;
            }
        }
        return count + (isNoneSpaceCharacter ? 1 : 0);
    }
}