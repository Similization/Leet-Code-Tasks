package otherTasks.Task496;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task496 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().nextGreaterElement2(
                new int[]{5, 4, 3, 2, 1, 6},
                new int[]{9, 8, 7, 3, 2, 1, 6}
        )));
        System.out.println(Arrays.toString(new Solution().nextGreaterElement2(
                new int[]{2, 4},
                new int[]{1, 2, 3, 4}
        )));
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            int nextGreatVal = -1;
            for (int j = 0, k = 0; j < nums2.length; ++j) {
                if (nums2[j] == nums1[i]) {
                    k = 1;
                } else if (k == 1 && nums2[j] > nums1[i]) {
                    nextGreatVal = nums2[j];
                    break;
                }
            }
            result[i] = nextGreatVal;
        }
        return result;
    }
    public int[] nextGreaterElement2(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
