package otherTasks.Task506;

import java.util.*;

public class Task506 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().findRelativeRanks2(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(new Solution().findRelativeRanks2(new int[]{10, 3, 8, 9, 4})));
    }
}

class Solution {

    static class Pair {
        int place;
        int rank;

        public Pair(int place, int rank) {
            this.place = place;
            this.rank = rank;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        int scoreLen = score.length;
        String[] result = new String[scoreLen];
        List<Pair> pairs = new ArrayList<>(scoreLen);

        for (int i = 0; i < scoreLen; ++i) {
            pairs.add(new Pair(i, score[i]));
        }
        pairs.sort((o1, o2) -> o2.rank - o1.rank);

        for (int i = 0; i < scoreLen; ++i) {
            var pair = pairs.get(i);
            switch (i) {
                case 0 -> result[pair.place] = "Gold Medal";
                case 1 -> result[pair.place] = "Silver Medal";
                case 2 -> result[pair.place] = "Bronze Medal";
                default -> result[pair.place] = String.valueOf(i + 1);
            }
        }

        return result;
    }

    public String[] findRelativeRanks2(int[] score) {
        int scoreLen = score.length;
        String[] result = new String[scoreLen];
        int[][] pairs = new int[scoreLen][2];

        for (int i = 0; i < scoreLen; ++i) {
            pairs[i][0] = score[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < scoreLen; ++i) {
            switch (i) {
                case 0 -> result[pairs[i][1]] = "Gold Medal";
                case 1 -> result[pairs[i][1]] = "Silver Medal";
                case 2 -> result[pairs[i][1]] = "Bronze Medal";
                default -> result[pairs[i][1]] = String.valueOf(i + 1);
            }
        }
        return result;
    }
}
