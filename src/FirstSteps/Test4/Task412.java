package FirstSteps.Test4;

import java.util.ArrayList;
import java.util.List;

public class Task412 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(15));
    }
}

class Solution {
    public List<String> fizzBuzz2(int n) {
        List<String> list = new ArrayList<>(n);
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0) {
                res.append("Fizz");
            }
            if (i % 5 == 0) {
                res.append("Buzz");
            }

            if (res.isEmpty()) {
                list.add(String.valueOf(i));
            }
            else {
                list.add(res.toString());
            }
        }
        return list;
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; ++i) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            }
            else if (i % 5 == 0) {
                list.add("Buzz");
            }
            else if (i % 3 == 0) {
                list.add("Fizz");
            }
            else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
