package otherTasks.Task278;

import java.util.ArrayList;
import java.util.List;

public class Task278 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        var vc = solution.create(3, 2);
        System.out.println(solution.firstBadVersion(3));
    }
}

class VersionControl {
    private List<Integer> versions;
    VersionControl create (int n, int badCount) {
        versions = new ArrayList<>(n);
        int i = 0;
        while (i < badCount - 1) {
            ++i;
            versions.add(0);
        }
        while (i < n) {
            ++i;
            versions.add(1);
        }
        return this;
    }
    boolean isBadVersion(int n) {
        return versions.get(n - 1) == 1;
    }
}

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
