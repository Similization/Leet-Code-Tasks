package otherTasks.Task500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task500 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().findWords(new String[]{
                "Hello","Alaska","Dad","Peace"
        })));
        System.out.println(Arrays.toString(new Solution().findWords(new String[]{
                "omk"
        })));
        System.out.println(Arrays.toString(new Solution().findWords(new String[]{
                "adsdf","sfd"
        })));
    }
}

class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for (var str : words) {
            if (str.toLowerCase().matches("^[qwertyuiop]+$|^[asdfghjkl]+$|^[zxcvbnm]+$")) {
                res.add(str);
            }
        }
        return res.toArray(new String[0]);
    }
}
