package otherTasks.Task476;

public class Task476 {
    public static void main(String[] args) {
        System.out.println(new Solution().findComplement(5));
        System.out.println(Integer.highestOneBit(15));
    }
}

class Solution {
    public int findComplement(int num) {
        int res = 0, count = 0;
        while (num != 1) {
            res += ((num & 1) == 1 ? 0 : 1) << (count++);
            num >>= 1;
        }
        return res;
    }
}