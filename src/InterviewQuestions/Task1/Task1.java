package InterviewQuestions.Task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
    }
}



class Solution {
    static class Pair implements Comparable<Pair> {
        private int num;
        private int pos;

        public Pair() {
        }

        public Pair(int num, int pos) {
            this.num = num;
            this.pos = pos;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        @Override
        public int compareTo(Pair o) {
            return num - o.num;
        }
    }
    public int[] twoSum3(int[] nums, int target) {
        Pair[] pairs = new Pair[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            pairs[i] = new Pair(nums[i], i);
        }
        Arrays.sort(pairs);
        int i, j = 0;

        outerLoop:
        for (i = 0; i < pairs.length - 1; ++i) {
            int start = i + 1, end = pairs.length;
            while (start < end) {
                j = start + (end - start) / 2;

                if (pairs[j].getNum() + pairs[i].getNum() == target) {
                    break outerLoop;
                } else if (pairs[j].getNum() + pairs[i].getNum() > target) {
                    end = j;
                } else {
                    start = j + 1;
                }
            }
        }
        return new int[] {pairs[i].getPos(), pairs[j].getPos()};
    }
    public int[] twoSum2(int[] nums, int target) {
        int i;
        int j = 0;
        outerLoop:
        for (i = 0; i < nums.length - 1; ++i) {
            for (j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    break outerLoop;
                }
            }
        }
        return new int[]{i, j};
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexesOfValues = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            if (indexesOfValues.containsKey(target - nums[i])) {
                return new int[]{indexesOfValues.get(target - nums[i]), i};
            }
            indexesOfValues.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}