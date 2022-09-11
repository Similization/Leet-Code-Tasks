package otherTasks.Task88;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task88 {
    public static void main(String[] args) {
//        new Solution().merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
//        new Solution().merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
//        new Solution().merge(new int[]{4, 0, 0, 0, 0, 0}, 1, new int[]{1, 2, 2, 3, 3}, 5);
//        new Solution().merge(new int[]{4, 0, 0, 0, 0, 0}, 1, new int[]{1, 2, 3, 5, 6}, 5);
//        new Solution().merge(new int[]{0}, 0, new int[]{1}, 1);
//        new Solution().merge(new int[]{1}, 1, new int[]{}, 0);
//        new Solution().merge(new int[]{0, 0, 3, 0, 0, 0, 0, 0, 0}, 3, new int[]{-1, 1, 1, 1, 2, 3}, 6);
        new Solution().merge(new int[]{-1,0,1,1,0,0,0,0,0}, 4, new int[]{-1,0,2,2,3}, 5);
        new Solution().merge(new int[]{-10,-10,-9,-9,-9,-8,-8,-7,-7,-7,-6,-6,-6,-6,-6,-6,-6,-5,
                        -5,-5,-4,-4,-4,-3,-3,-2,-2,-1,-1,0,1,1,1,2,2,2,3,3,3,4,5,5,6,6,6,6,7,7,
                        7,7,8,9,9,9,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                        0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                        0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, 55,
                new int[]{-10,-10,-9,-9,-9,-9,-8,-8,-8,-8,-8,-7,-7,-7,-7,-7,-7,-7,-7,-6,-6,-6,
                        -6,-5,-5,-5,-5,-5,-4,-4,-4,-4,-4,-3,-3,-3,-2,-2,-2,-2,-2,-2,-2,-1,-1,-1,
                        0,0,0,0,0,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,
                        6,6,7,7,7,7,7,7,7,8,8,8,8,9,9,9,9}, 99);
    }
}

class Solution {
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        System.out.println(nums1);
        nums1 = Arrays.stream(nums1).sorted().toArray();
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2, if any
            nums1[finished--] = nums2[tail2--];
        }
    }
}
