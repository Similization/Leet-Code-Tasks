package otherTasks.Task168;

public class Task168 {
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(1));
        System.out.println(new Solution().convertToTitle(28));
        System.out.println(new Solution().convertToTitle(56));
        System.out.println(new Solution().convertToTitle(676));
        System.out.println(new Solution().convertToTitle(701));
        System.out.println(new Solution().convertToTitle(702));
        System.out.println(new Solution().convertToTitle(703));
    }
}

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            res.append(Character.toString('A' + (columnNumber) % 26));
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }
}