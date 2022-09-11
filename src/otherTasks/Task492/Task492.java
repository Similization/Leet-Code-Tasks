package otherTasks.Task492;

import java.util.Arrays;

public class Task492 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().constructRectangle(4)));
        System.out.println(Arrays.toString(new Solution().constructRectangle(37)));
        System.out.println(Arrays.toString(new Solution().constructRectangle(122122)));
    }
}

class Solution {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        return new int[]{area / w, w};
    }
}