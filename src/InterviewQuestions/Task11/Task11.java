package InterviewQuestions.Task11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxArea(new int[]{1, 2, 3, 4, 1, 4, 2}));
        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(new Solution().maxArea(new int[]{2, 3, 4, 5, 18, 17, 6}));
    }
}

class Solution {

    static class Pair {
        private int first;
        private int last;

        public Pair(int first, int last) {
            this.first = first;
            this.last = last;
        }

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public int getLast() {
            return last;
        }

        public void setLast(int last) {
            this.last = last;
        }
    }

    public int maxArea(int[] height) {
        Map<Integer, Pair> heightMap = new HashMap<>();
        int max = 0;

        for (int i = 0; i < height.length; ++i) {
            if (!heightMap.containsKey(height[i])) {
                heightMap.put(height[i], new Pair(i, i));
            } else {
                heightMap.get(height[i]).setLast(i);
            }

            for (var nextPair : heightMap.entrySet()) {
                if (nextPair.getKey() == height[i] && nextPair.getValue().getLast() == nextPair.getValue().getFirst()) {
                    continue;
                }
                var pair = nextPair.getValue();
                var currPair = heightMap.get(height[i]);
                int maxLen = 0;

                if (Math.abs(pair.getFirst() - currPair.getLast()) > maxLen) {
                    maxLen = Math.abs(pair.getFirst() - currPair.getLast());
                }
                if (Math.abs(pair.getLast() - currPair.getFirst()) > maxLen) {
                    maxLen = Math.abs(pair.getLast() - currPair.getFirst());
                }

                max = Math.max(max, maxLen * Math.min(height[i], nextPair.getKey()));
            }
        }

        return max;
    }
}
