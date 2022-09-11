package InterviewQuestions.Task20;

import javax.management.Query;
import java.util.*;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("((()(())))()"));
        System.out.println(new Solution().isValid("[[]{[()]}]"));
    }
}

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                characters.add(ch);
            } else {
                if (characters.isEmpty()) {
                    return false;
                }
                char lastChar = characters.pop();
                if (!(lastChar == '{' && ch == '}' || lastChar == '(' && ch == ')' || lastChar == '[' && ch == ']')) {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }
}
