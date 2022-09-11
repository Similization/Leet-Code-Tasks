package otherTasks.Task594;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task594 {
    public static void main(String[] args) {
        System.out.println(new Solution().findLHS(new int[] {1,3,2,2,5,2,3,7}));
    }
}

class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int key: map.keySet()) {
            if (map.containsKey(key + 1))
                count = Math.max(count, map.get(key) + map.get(key + 1));
        }
        return count;
    }
}