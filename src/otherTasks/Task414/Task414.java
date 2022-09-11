package otherTasks.Task414;

public class Task414 {
    public static void main(String[] args) {
        System.out.println(new Solution().thirdMax(new int[]{
                1, 2, 2, 5, 3, 5
        }));
        System.out.println(new Solution().thirdMax(new int[]{
                2, 2, 5, 1
        }));
        System.out.println(new Solution().thirdMax(new int[]{
                3, 2, 1
        }));
        System.out.println(new Solution().thirdMax(new int[]{
                -1, -2, -2, -5, -3, -5
        }));
        System.out.println(new Solution().thirdMax(new int[]{
                -2, -2, -5, -1
        }));
        System.out.println(new Solution().thirdMax(new int[]{
                -3,-2, -1
        }));
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        int max1 = nums[0], max2 = max1, max3 = max1;
        int j = 0;
        for (int num : nums) {
            if (num == max1 || num == max2) {
                continue;
            }
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2 || max2 == max1) {
                max3 = max2;
                max2 = num;
            } else if (num > max3 || max3 == max2 || max3 == max1) {
                max3 = num;
            } else {
                continue;
            }
            ++j;
        }
        return max3 == max2 || max3 == max1 ? max1 : max3;
    }
}
