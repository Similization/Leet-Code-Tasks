package otherTasks.Task605;

public class Task605 {
    public static void main(String[] args) {
        System.out.println(new Solution().canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));
        System.out.println(new Solution().canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        System.out.println(new Solution().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        System.out.println(new Solution().canPlaceFlowers(new int[]{1, 0, 1, 0, 1, 0, 1}, 2));
    }
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean emptyLeft;
        boolean emptyRight;
        for (int i = 0; i < flowerbed.length; ++i) {
            emptyLeft = (i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0;
            emptyRight = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) && flowerbed[i] == 0;
            if (emptyLeft && emptyRight) {
                flowerbed[i] = 1;
                if (--n == 0) break;
            }
        }
        return n == 0;
    }
}
