package otherTasks.Task682;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task682 {
    public static void main(String[] args) {
        System.out.println(new Solution().calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println(new Solution().calPoints(new String[]{"5", "C"}));
    }
}

class Solution {
    public int calPoints(String[] ops) {
        List<Integer> points = new ArrayList<>();
        for (String str : ops) {
            int size = points.size();
            switch (str) {
                case "D" -> points.add(points.get(size - 1) * 2);
                case "C" -> points.remove(size - 1);
                case "+" -> points.add(points.get(size - 1) + points.get(size - 2));
                default -> points.add(Integer.parseInt(str));
            }
        }
        return points.stream().reduce(0, Integer::sum);
    }
}