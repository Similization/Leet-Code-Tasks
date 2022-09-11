package InterviewQuestions.Task17;

import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("23"));
    }
}

class Solution {
    public List<String> letterCombinations2(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>(0);
        }
        List<String> result = new ArrayList<>((int) Math.pow(3, digits.length()));

        Map<Character, char[]> listMap = new HashMap<>(8);
        listMap.put('2', new char[]{'a', 'b', 'c'});
        listMap.put('3', new char[]{'d', 'e', 'f'});
        listMap.put('4', new char[]{'g', 'h', 'i'});
        listMap.put('5', new char[]{'j', 'k', 'l'});
        listMap.put('6', new char[]{'m', 'n', 'o'});
        listMap.put('7', new char[]{'p', 'q', 'r', 's'});
        listMap.put('8', new char[]{'t', 'u', 'v'});
        listMap.put('9', new char[]{'w', 'x', 'y', 'z'});

        for (var chf : listMap.get(digits.charAt(0))) {
            result.add(chf + "");
        }

        for (int i = 1; i < digits.length(); ++i) {
            int len = result.size();
            for (int j = 0; j < len; ++j) {
                String subStr = result.remove(0);
                for (var ch : listMap.get(digits.charAt(i))) {
                    result.add(subStr + ch);
                }
            }
        }
        return result;
    }

    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        while(ans.peek().length()!=digits.length()){
            String remove = ans.remove();
            String map = mapping[digits.charAt(remove.length())-'0'-2];
            for(char c: map.toCharArray()){
                ans.addLast(remove+c);
            }
        }
        return ans;
    }
}
