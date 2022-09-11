package InterviewQuestions.Task46;

import java.util.ArrayList;
import java.util.List;

public class Task46 {
    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1, 2, 3}));
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> newArr = new ArrayList<>();
        newArr.add(nums[0]);
        result.add(newArr);

        for (int k = 1; k < nums.length; ++k) { // 1 2 3
            int resLen = result.size();
            for (int i = 0; i < resLen; ++i) {
                var arr = result.remove(0);
                for (int j = 0; j <= arr.size(); ++j) {
                    newArr = new ArrayList<>(arr);
                    newArr.add(j, nums[k]);
                    result.add(newArr);
                }
            }
        }
        return result;
    }
}