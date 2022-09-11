package InterviewQuestions.Task26;

public class Task26 {
    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[]{0, 0, 1, 2, 2, 2}));
        System.out.println(new Solution().removeDuplicates(new int[]{0}));
        System.out.println(new Solution().removeDuplicates(new int[]{0, 1, 2, 3}));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int prevPos = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[prevPos]) {
                nums[++prevPos] = nums[i];
            }
        }
        return prevPos + 1;
    }
}

