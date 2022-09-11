package otherTasks.Task523;

import java.util.HashMap;
import java.util.Map;

public class Task523 {
    public static void main(String[] args) {
        System.out.println(new Solution().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
        System.out.println(new Solution().checkSubarraySum(new int[]{23, 2, 4, 6, 6}, 7));
        System.out.println(new Solution().checkSubarraySum(new int[]{2, 3}, 5));
    }
}

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(){{
            put(0, -1);
        }};
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];              // 23 7 7 5 7    // 23 4 8 7 6
            sum %= k;                    // _5 1 1 5 0    // _2 4 1 0
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) {
                    return true;
                }
            } else {
                map.put(sum, i);          // 5;0 1;1 5;3
            }
        }
        return false;
    }
}
