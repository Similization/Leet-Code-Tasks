package otherTasks.Task455;

import java.util.Arrays;

public class Task455 {
    public static void main(String[] args) {
        System.out.println(new Solution().findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(new Solution().findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
        System.out.println(new Solution().findContentChildren(new int[]{1, 2, 4}, new int[]{1, 1, 2, 3}));
        System.out.println(new Solution().findContentChildren(new int[]{1, 1, 1}, new int[]{1, 1, 1}));
        System.out.println(new Solution().findContentChildren(new int[]{1, 1, 2}, new int[]{1, 1, 1}));
        System.out.println(new Solution().findContentChildren(new int[]{5, 6, 7}, new int[]{1, 1, 1}));
    }
}

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        for (; i < g.length && j < s.length; ++j) {
            if (g[i] <= s[j]) {
                ++i;
            }
        }
        return i;
    }
}