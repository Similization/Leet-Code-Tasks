package otherTasks.Task345;

import java.util.Arrays;

public class Task345 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels("hello"));
        System.out.println(new Solution().reverseVowels("LeetCode"));
    }
}

class Solution {
    boolean isConsonants(Character character) {
        switch (character) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                return false;
            }
        }
        return true;
    }
    public String reverseVowels(String s) {
        var arr = s.toCharArray();
        for(int left = 0, right = s.length() - 1; left < right;)
            if (isConsonants(Character.toLowerCase(arr[left]))) {
                ++left;
            } else if (isConsonants(Character.toLowerCase(arr[right]))) {
                --right;
            } else {
                var ch = arr[left];
                arr[left++] = arr[right];
                arr[right--] = ch;
            }
        return String.valueOf(arr);
    }
}