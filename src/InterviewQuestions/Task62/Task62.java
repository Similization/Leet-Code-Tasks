package InterviewQuestions.Task62;

import java.util.HashMap;
import java.util.Map;

public class Task62 {
    public static void main(String[] args) {
        // System.out.println(new Solution().uniquePaths2(23, 12));
        System.out.println(new Solution().uniquePaths3(3, 4));
    }
}

class Solution {
    Map<String, Integer> paths = new HashMap<>();
    public int uniquePaths(int m, int n) {
        if (n == 1 || m == 1) {
            return 1;
        }

        String key = m + ":" + n;
        if (!paths.containsKey(key)) {
            paths.put(key, uniquePaths(m - 1, n) + uniquePaths(m, n - 1));
        }
        return paths.get(key);
    }
    public int uniquePaths2(int m, int n) {
        if (n == 1 || m == 1) {return 1;}
        return uniquePaths2(m - 1, n) + uniquePaths2(m, n - 1);
    }
    public int uniquePaths3(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m < n) {              // Swap, so that m is the bigger number
            m = m + n;
            n = m - n;
            m = m - n;
        }
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++, j++){       // Instead of taking factorial, keep on multiply & divide
            res *= i;
            res /= j;
        }

        return (int)res;
    }
}
