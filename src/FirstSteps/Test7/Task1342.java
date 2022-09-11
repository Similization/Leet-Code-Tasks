package FirstSteps.Test7;

public class Task1342 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfSteps(14));
        System.out.println(solution.numberOfSteps(8));
        System.out.println(solution.numberOfSteps(123));
    }
}

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                --num;
            }
            ++count;
        }
        return count;
    }
}
