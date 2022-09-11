package otherTasks.Task9;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
        System.out.println(new Solution().isPalindrome2(121));
        System.out.println(new Solution().isPalindrome(1221));
        System.out.println(new Solution().isPalindrome2(1221));
        System.out.println(new Solution().isPalindrome(1));
        System.out.println(new Solution().isPalindrome2(1));
        System.out.println(new Solution().isPalindrome(1234321));
        System.out.println(new Solution().isPalindrome2(1234321));
        System.out.println(new Solution().isPalindrome(123321));
        System.out.println(new Solution().isPalindrome2(123321));
        System.out.println(new Solution().isPalindrome(20));
        System.out.println(new Solution().isPalindrome2(20));
        System.out.println(new Solution().isPalindrome(201));
        System.out.println(new Solution().isPalindrome2(201));
        System.out.println(new Solution().isPalindrome(12));
        System.out.println(new Solution().isPalindrome2(12));
    }
}

class Solution {
    public boolean isPalindrome2(int x) {
        String number = String.valueOf(x);
        for (int i = 0; i < number.length() / 2; ++i) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) { return false; }

        int rightHalf = 0;
        while (x > rightHalf) {
            rightHalf = rightHalf * 10 + x % 10;
            x /= 10;
        }
        return x == rightHalf || x == rightHalf / 10;
    }
}