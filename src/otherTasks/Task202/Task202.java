package otherTasks.Task202;

import java.util.HashSet;
import java.util.Set;

public class Task202 {
    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(2));
        System.out.println(new Solution().isHappy(19));
        System.out.println(new Solution().isHappy(1000000));
    }
}

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();
        while (true) {
            int newNum = 0;
            while (n != 0) {
                int num = n % 10;
                n /= 10;
                newNum += num * num;
            }
            n = newNum;
            if (n == 1) {
                return true;
            }
            if (nums.contains(n)) {
                return false;
            } else {
                nums.add(n);
            }
        }
    }

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy2(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }
}
