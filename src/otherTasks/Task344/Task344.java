package otherTasks.Task344;

public class Task344 {
    public static void main(String[] args) {

    }
}

class Solution {
    public void reverseString(char[] s) {
        var len = s.length - 1;
        for (int i = 0; i < len / 2; ++i) {
            var ch = s[i];
            s[i] = s[len - i];
            s[len - i] = ch;
        }
    }
}