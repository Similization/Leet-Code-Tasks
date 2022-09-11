package otherTasks.Task448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task448 {
    public static void main(String[] args) {
        System.out.println(new Solution().findDisappearedNumbers(new int[]{1, 1}));
        System.out.println(new Solution().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}

class Solution {
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= nums.length; ++i) {
            res.add(i);
        }
        for (int num : nums) {
            res.remove((Integer) num);
        }
        return res;
    }
    public List<Integer> findDisappearedNumbers3(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            res[i] = i + 1;
        }
        for (int num : nums) {
            res[num - 1] = 0;
        }
        return Arrays.stream(res).filter(value -> value != 0).boxed().collect(Collectors.toList());
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
        for (int i = 0; i < nums.length; i ++) if (nums[i] <= n) res.add(i+1);
        return res;
    }
}
