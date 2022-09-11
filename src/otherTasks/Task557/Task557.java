package otherTasks.Task557;

import java.util.*;
import java.util.stream.Collectors;

public class Task557 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("Let's take LeetCode contest"));
    }
}

class Solution {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(str -> new StringBuilder(str).reverse())
                .collect(Collectors.joining(" "));
    }
}