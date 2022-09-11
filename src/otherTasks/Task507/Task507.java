package otherTasks.Task507;

public class Task507 {
    public static void main(String[] args) {
        System.out.println(new Solution().checkPerfectNumber(28));
    }
}

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int div = 1; div * div <= num; ++div) {
            if (num % div == 0) {
                sum += div;
                if (div * div != num) {
                    sum += num / div;
                }
            }
        }
        return sum == num * 2;
    }
}