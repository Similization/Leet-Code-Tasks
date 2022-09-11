package otherTasks.Task349;

import java.util.*;
import java.util.stream.Collectors;

public class Task349 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().intersection(
                new int[]{1, 2, 2, 1},
                new int[]{2, 2}
        )));
        System.out.println(Arrays.toString(new Solution().intersection(
                new int[]{4, 9, 5},
                new int[]{9, 4, 9, 8, 4}
        )));
        System.out.println(Arrays.toString(new Solution().intersection(
                new int[]{6, 6, 4, 0, 2, 8, 8, 9},
                new int[]{6}
        )));
    }
}

class Solution {
    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        set1.retainAll(set2);
        return set1.stream().mapToInt(value -> value).toArray();
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Stack<Integer> result = new Stack<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums2[j] < nums1[i]) {
                ++j;
            } else {
                if (result.empty() || !result.empty() && nums1[i] != result.peek()) {
                    result.add(nums1[i]);
                }
                ++i;
                ++j;
            }

        }
        return result.stream().mapToInt(value -> value).toArray();
    }
    public int[] intersection3(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }
}
