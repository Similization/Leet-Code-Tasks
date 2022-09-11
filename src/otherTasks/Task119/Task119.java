package otherTasks.Task119;

import java.util.ArrayList;
import java.util.List;

public class Task119 {
    public static void main(String[] args) {
        System.out.println(new Solution().getRow(0));
        System.out.println(new Solution().getRow(1));
        System.out.println(new Solution().getRow(2));
        System.out.println(new Solution().getRow(3));
        System.out.println(new Solution().getRow(4));
        System.out.println(new Solution().getRow(5));
        System.out.println(new Solution().getRow(6));
        System.out.println(new Solution().getRow(7));
        System.out.println(new Solution().getRow(8));
    }
}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i <= rowIndex; ++i) {
            result.add(0, 1);
            for (int j = 1; j < result.size() - 1; ++j) {
                result.set(j, result.get(j) + result.get(j + 1));
            }
        }
        return result;
    }
}
